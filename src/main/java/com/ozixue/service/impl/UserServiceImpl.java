package com.ozixue.service.impl;

import com.ozixue.mapper.UserMapper;
import com.ozixue.model.User;
import com.ozixue.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional// 开启事务
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper mapper;
    //private JdbcTemplate template;

    @Override
    public void register(String username, String password) {
//        String sql = "insert it_user (username,password) values(?,?)";
//        template.update(sql, username, password);
        mapper.save(username, password);
        int i = 10 / 0;
    }

    @Override
    public User findUser(String username) {
        return mapper.findByUsername(username);
    }
}
