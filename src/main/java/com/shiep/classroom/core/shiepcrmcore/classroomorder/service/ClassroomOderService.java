package com.shiep.classroom.core.shiepcrmcore.classroomorder.service;

import com.github.pagehelper.Page;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomBookingDTO;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepBuildingInfoVo;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepClassroomTypeInfoVo;

import java.text.ParseException;
import java.util.List;

/**
 * @program: shiep-crm-core
 * @description: 教室预约接口
 * @author: liziyue
 * @create: 2019-01-10 19:09
 **/
public interface ClassroomOderService {

    /**
     * 获取所有教室预约状况
     * @return
     */
    Page getAllClassroomList(ShiepClassroomInfoDTO shiepClassroomInfoDTO);

    /**
     * 获取所有楼幢信息
     * @return
     */
    List<ShiepBuildingInfoVo> getAllBuildingList();

    /**
     * 获取所有预约信息
     * @return
     */
    List<ShiepClassroomBookingDTO> getBookingInfoList(ShiepClassroomBookingDTO shiepClassroomBookingDTO) throws ParseException;

    /**
     * 获取所有教室类型
     * @return
     */
    List<ShiepClassroomTypeInfoVo> getAllBuildingType();

}
