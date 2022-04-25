package com.hz.service.impl;

import com.hz.dao.adminDao;
import com.hz.service.adminservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminserviceimpl implements adminservice {
    @Autowired
    private adminDao adminDao;
    @Override
    public void update() {
        adminDao.update("zhang",90);
        adminDao.update("lisi",110);
    }
}
