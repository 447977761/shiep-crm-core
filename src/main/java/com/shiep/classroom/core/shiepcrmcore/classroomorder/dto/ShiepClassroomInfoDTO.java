package com.shiep.classroom.core.shiepcrmcore.classroomorder.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepClassroomInfoVo;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @program: shiep-crm-core
 * @description: shiep_classroom_info 传输类
 * @author: liziyue
 * @create: 2019-01-10 19:18
 **/
@Data
public class ShiepClassroomInfoDTO extends ShiepClassroomInfoVo {

    /**
     * 大楼名字
     */
    private String buildingName;

    /**
     * 大楼tabId
     */
    private String buildingTabId;

    /**
     * 房间类型
     */
    private String roomTypeName;

    /**
     * 房间类型code
     */
    private String roomTypeCode;

    /**
     * 预约开始时间 最近
     */
    private Timestamp orderStartDate;

    /**
     * 预约结束时间 最近
     */
    private Timestamp orderEndDate;

    /**
     * 最新预约时间
     */
    private String latestOder;
}
