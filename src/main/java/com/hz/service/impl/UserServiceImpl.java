package com.hz.service.impl;

import com.hz.dao.UserDao;
import com.hz.pojo.User;
import com.hz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.Setter;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
   @Setter
    private UserDao userDao;


    public List<User> findUserById() {

        return userDao.findUserById();
    }
}

