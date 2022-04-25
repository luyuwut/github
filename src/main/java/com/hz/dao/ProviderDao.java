package com.hz.dao;

import com.hz.pojo.User;
import com.hz.pojo.bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProviderDao {
    List<bill> findAll(@Param("start") int start, @Param("username") String username);
}
