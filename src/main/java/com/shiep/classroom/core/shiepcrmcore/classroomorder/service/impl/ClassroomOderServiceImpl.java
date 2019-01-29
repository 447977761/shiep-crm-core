package com.shiep.classroom.core.shiepcrmcore.classroomorder.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dao.ClassroomOderDao;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomBookingDTO;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.service.ClassroomOderService;
import com.shiep.classroom.core.shiepcrmcore.common.ShmCodeEnum;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepBuildingInfoVo;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepClassroomTypeInfoVo;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: shiep-crm-core
 * @description: 教室预约接口实现类
 * @author: liziyue
 * @create: 2019-01-10 19:14
 **/
@Service
@Transactional
public class ClassroomOderServiceImpl implements ClassroomOderService {

    @Autowired
    private ClassroomOderDao classroomOderDao;

    private static Logger log = Logger.getLogger(ClassroomOderServiceImpl.class);

    @Override
    public Page getAllClassroomList(ShiepClassroomInfoDTO shiepClassroomInfoDTO) {
        Integer pageNum = shiepClassroomInfoDTO.getPageNum();
        Integer pageSize = shiepClassroomInfoDTO.getPageSize();
        if (null == pageNum || null == pageSize) {
            log.error("[" + ShmCodeEnum.PAGE_HELPER_901.getCode() + "]:" + ShmCodeEnum.PAGE_HELPER_901.getDesc());
        } else {
            PageHelper.startPage(pageNum, pageSize, true);
        }
        List<ShiepClassroomInfoDTO> shiepClassroomInfoDTOS = classroomOderDao.getAllClassroomList(shiepClassroomInfoDTO);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(null != shiepClassroomInfoDTOS){
            for(ShiepClassroomInfoDTO classroomInfoDTO:shiepClassroomInfoDTOS){
                if(null != classroomInfoDTO.getOrderEndDate() && null !=classroomInfoDTO.getOrderStartDate()) {
                    String formatStart = formatter.format(classroomInfoDTO.getOrderStartDate());
                    String formatEnd = formatter.format(classroomInfoDTO.getOrderEndDate());
                    classroomInfoDTO.setLatestOder(formatStart + " - " + formatEnd);
                }
            }
        }
        return (Page) shiepClassroomInfoDTOS;
    }

    @Override
    public List<ShiepBuildingInfoVo> getAllBuildingList() {
        return classroomOderDao.getAllBuildingList();
    }

    @Override
    public List<ShiepClassroomBookingDTO> getBookingInfoList(ShiepClassroomBookingDTO shiepClassroomBookingDTO) throws ParseException {
        Date currentDate = shiepClassroomBookingDTO.getQueryDate();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String formatQuery = formatter.format(currentDate);
        Date startDate = formatter.parse(formatQuery);
        Date endDate = new Date(startDate.getTime() + 60 * 60 * 24 *1000 - 1000);
        String classroomCode = shiepClassroomBookingDTO.getClassroomCode();
        List<ShiepClassroomBookingDTO> shiepClassroomBookingDTOList = classroomOderDao.getBookingInfoList(startDate, endDate, classroomCode);
        return shiepClassroomBookingDTOList;
    }

    @Override
    public List<ShiepClassroomTypeInfoVo> getAllBuildingType() {
        return classroomOderDao.getAllBuildingType();
    }
}
