package com.ozixue.service.impl;

import com.ozixue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private JdbcTemplate template;

    @Override
    public void register(String username, String password) {
        String sql = "insert it_user (username,password) values(?,?)";
        template.update(sql, username, password);
    }
}
