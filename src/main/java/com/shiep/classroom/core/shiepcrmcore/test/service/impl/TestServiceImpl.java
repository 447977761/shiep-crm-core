package com.shiep.classroom.core.shiepcrmcore.test.service.impl;

import com.shiep.classroom.core.shiepcrmcore.test.dao.TestConnectDao;
import com.shiep.classroom.core.shiepcrmcore.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: shiep-crm-core
 * @description: 测试接口实现类
 * @author: liziyue
 * @create: 2019-01-04 18:43
 **/
@Service
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TestConnectDao testConnectDao;

    @Override
    public void testConnect() {
        long id = testConnectDao.testConnect();
        System.out.println(id);
    }
}
