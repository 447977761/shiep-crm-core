package com.shiep.classroom.core.shiepcrmcore.classroomorder.dao;

import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepBuildingInfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
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
    List<ShiepClassroomInfoDTO> getAllClassroomList(ShiepClassroomInfoDTO shiepClassroomInfoDTO);

    /**
     * 获取所有楼幢信息
     * @return
     */
    List<ShiepBuildingInfoVo> getAllBuildingList();

}
