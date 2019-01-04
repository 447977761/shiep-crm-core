package com.shiep.classroom.core.shiepcrmcore.test.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @program: shiep-crm-core
 * @description: 测试Dao
 * @author: liziyue
 * @create: 2019-01-04 18:43
 **/
@Mapper
@Component("testConnectDao")
public interface TestConnectDao {

    /**
     * 测试连接
     * @return
     */
    Long testConnect();

}
