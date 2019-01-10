package com.shiep.classroom.core.shiepcrmcore.classroomorder.service;

import com.github.pagehelper.Page;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;

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

}
