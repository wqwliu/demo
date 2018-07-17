package com.qf.manager.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao-test.xml"})
public class TbStaffMapperTest {

    @Autowired
    private TbStaffMapper tbStaffMapper;

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        System.out.println(tbStaffMapper.selectByPrimaryKey(1L));
    }

}