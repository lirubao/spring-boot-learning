package com.ozixue.web.controller;

import com.ozixue.model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @EnableAutoConfiguration
@RequestMapping("user")
public class UserController {

    @RequestMapping("{id}")
    @ResponseBody// 响应体 自动返回json数据
    public User hello(@PathVariable Integer id) {
        int i = 10 / 0;// 模拟异常
        return User.builder().id(id).username("张三").password("123").build();
    }

}
