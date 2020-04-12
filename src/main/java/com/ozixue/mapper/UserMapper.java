package com.ozixue.mapper;

import com.ozixue.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    void save(@Param("username") String username, @Param("password") String password);

    User findByUsername(String username);
}
