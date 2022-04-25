package com.hz.service.impl;


import com.hz.pojo.User;
import com.hz.pojo.bill;
import com.hz.service.UserService;
import com.hz.service.billService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;


public class billServiceimplTest {

    @Test
    public void selectInformation() {
        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring-mybatis.xml");

       billService billServices = (billService)applicationContext.getBean("billServiceimpl");
        List<bill> lists=billServices.selectInformation();
        for (bill bill:lists){
            System.out.println(lists.toString());
        }

    }
}
