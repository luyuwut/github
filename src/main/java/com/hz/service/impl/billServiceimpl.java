package com.hz.service.impl;

import com.hz.dao.billDao;
import com.hz.pojo.bill;
import lombok.Setter;
import com.hz.service.billService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class billServiceimpl implements billService{

    @Autowired
    @Setter
    private billDao billDao;
    @Override
    public List<bill> selectInformation()
    {
   return billDao.selectInformation();
    }
}
