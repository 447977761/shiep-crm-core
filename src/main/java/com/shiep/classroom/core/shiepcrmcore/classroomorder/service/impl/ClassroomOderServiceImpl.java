package com.shiep.classroom.core.shiepcrmcore.classroomorder.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.controller.ClassroomOderController;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dao.ClassroomOderDao;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.service.ClassroomOderService;
import com.shiep.classroom.core.shiepcrmcore.common.ShmCodeEnum;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepBuildingInfoVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        if(null == pageNum || null == pageSize){
            log.error("["+ShmCodeEnum.PAGE_HELPER_901.getCode()+"]:"+ShmCodeEnum.PAGE_HELPER_901.getDesc());
        }else{
            PageHelper.startPage(pageNum,pageSize,true);
        }
        List<ShiepClassroomInfoDTO> shiepClassroomInfoDTOS =  classroomOderDao.getAllClassroomList();
        return (Page) shiepClassroomInfoDTOS;
    }

    @Override
    public List<ShiepBuildingInfoVo> getAllBuildingList() {
        return classroomOderDao.getAllBuildingList();
    }
}
