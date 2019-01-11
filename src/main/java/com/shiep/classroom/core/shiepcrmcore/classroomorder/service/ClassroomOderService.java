package com.shiep.classroom.core.shiepcrmcore.classroomorder.service;

import com.github.pagehelper.Page;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepBuildingInfoVo;

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

}
