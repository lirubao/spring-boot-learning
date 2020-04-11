package com.ozixue.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * RestController注解 相当于声明Controller - 提供Restful 风格
 * EnableAutoConfiguration注解 自动配置，不需要写spring的配置文件
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name) {
        return name + "Hello Boot Controller";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
