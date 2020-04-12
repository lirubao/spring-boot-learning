package com.ozixue.service;

import com.ozixue.model.User;

public interface IUserService {

    void register(String username,String password);

    User findUser(String username);
}
