package com.ozixue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@MapperScan(basePackages = "com.ozixue.mapper")
@ComponentScan(basePackages = {"com.ozixue.web", "com.ozixue.service"})// 配置扫描的包
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
