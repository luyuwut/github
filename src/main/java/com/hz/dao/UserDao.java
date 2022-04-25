package com.hz.dao;

import com.hz.pojo.User;

import java.util.List;


public interface UserDao {
    public List<User> findUserById();

}
