package com.hz.dao;

import org.apache.ibatis.annotations.Param;

public interface adminDao {
    public  int update(

            @Param("name") String name,@Param("money") Integer money);
}
