package com.shiep.classroom.core.shiepcrmcore.test.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.shiep.classroom.core.shiepcrmcore.common.ResponseEntity;
import com.shiep.classroom.core.shiepcrmcore.common.ShmCodeEnum;
import com.shiep.classroom.core.shiepcrmcore.test.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: shiep-crm-core
 * @description: 测试控制层
 * @author: liziyue
 * @create: 2019-01-04 18:40
 **/
@RestController
@RequestMapping("/shiep/crm")
public class TestController {

    @Autowired
    private TestService testService;

    private static Logger log = Logger.getLogger(TestController.class);

    @RequestMapping("/test")
    public ResponseEntity testConnect(@RequestBody String param) {
        ResponseEntity re = new ResponseEntity();
        JSONObject jo = JSON.parseObject(param);
        String words = jo.getString("testWord");
        System.out.println("成功接收到数据 =========》》》》》》"+words);
        try{
            testService.testConnect();
            re.setSuccess(true);
            re.setCode(ShmCodeEnum.REQUEST_SUCCESS_200.getCode());
            re.setMessage(ShmCodeEnum.REQUEST_SUCCESS_200.getDesc());
        }catch (Exception e){
            log.error("连接出错");
            re.setSuccess(false);
            re.setCode(ShmCodeEnum.REQUEST_FAIL_900.getCode());
            re.setMessage(ShmCodeEnum.REQUEST_FAIL_900.getDesc());
        }
        return re;
    }

}
