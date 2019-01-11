package com.shiep.classroom.core.shiepcrmcore.classroomorder.controller;


import com.github.pagehelper.Page;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.dto.ShiepClassroomInfoDTO;
import com.shiep.classroom.core.shiepcrmcore.classroomorder.service.ClassroomOderService;
import com.shiep.classroom.core.shiepcrmcore.common.ResponseEntity;
import com.shiep.classroom.core.shiepcrmcore.common.ShmCodeEnum;
import com.shiep.classroom.core.shiepcrmcore.common.entity.po.ShiepBuildingInfoVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: shiep-crm-core
 * @description: 教室预约
 * @author: liziyue
 * @create: 2019-01-10 19:09
 **/
@RestController
@RequestMapping("/shiep/crm")
public class ClassroomOderController {

    @Autowired
    private ClassroomOderService classroomOderService;

    private static Logger log = Logger.getLogger(ClassroomOderController.class);

    @RequestMapping("/allClassroomList")
    public ResponseEntity getAllClassroomList(@RequestBody ShiepClassroomInfoDTO shiepClassroomInfoDTO) {
        ResponseEntity re = new ResponseEntity();
        try{
            Page page =  classroomOderService.getAllClassroomList(shiepClassroomInfoDTO);
            long total = page.getTotal();
            Map<String, Object> result = new HashMap<>(2);
            result.put("total", total);
            result.put("list", page.getResult());
            re.setResult(result);
            re.setSuccess(true);
            re.setCode(ShmCodeEnum.REQUEST_SUCCESS_200.getCode());
            re.setMessage(ShmCodeEnum.REQUEST_SUCCESS_200.getDesc());
        }catch (Exception e){
            re.setSuccess(false);
            re.setCode(ShmCodeEnum.REQUEST_FAIL_900.getCode());
            re.setMessage(ShmCodeEnum.REQUEST_FAIL_900.getDesc());
            log.error("内部错误:{}",e);
        }
        return re;
    }

    @RequestMapping("/allBuildingList")
    public ResponseEntity getAllBuildingList() {
        ResponseEntity re = new ResponseEntity();
        try{
            List<ShiepBuildingInfoVo> shiepBuildingInfoVos =  classroomOderService.getAllBuildingList();
            re.setResult(shiepBuildingInfoVos);
            re.setSuccess(true);
            re.setCode(ShmCodeEnum.REQUEST_SUCCESS_200.getCode());
            re.setMessage(ShmCodeEnum.REQUEST_SUCCESS_200.getDesc());
        }catch (Exception e){
            re.setSuccess(false);
            re.setCode(ShmCodeEnum.REQUEST_FAIL_900.getCode());
            re.setMessage(ShmCodeEnum.REQUEST_FAIL_900.getDesc());
            log.error("内部错误:{}",e);
        }
        return re;
    }

}
