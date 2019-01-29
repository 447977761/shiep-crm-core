package com.shiep.classroom.core.shiepcrmcore.classroomorder.dto;

import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepClassroomBookingVo;
import lombok.Data;

import java.util.Date;

/**
 * @program: shiep-crm-core
 * @description: 教室预约信息类
 * @author: liziyue
 * @create: 2019-01-28 15:12
 **/
@Data
public class ShiepClassroomBookingDTO extends ShiepClassroomBookingVo {

    /**
     * 信息状态
     */
    private String status;

    /**
     * 查询日期
     */
    private Date queryDate;

}
