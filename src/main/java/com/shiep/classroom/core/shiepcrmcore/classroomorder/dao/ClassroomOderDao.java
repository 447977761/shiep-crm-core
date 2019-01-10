package com.shiep.classroom.core.shiepcrmcore.classroomorder.dao;

import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: shiep-crm-core
 * @description: 教室预约Dao层
 * @author: liziyue
 * @create: 2019-01-10 19:18
 **/
@Mapper
@Component("classroomOderDao")
public interface ClassroomOderDao {

    /**
     * 获取所有教室预约信息
     * @return
     */
    List<ShiepClassroomInfoDTO> getAllClassroomList();

}
