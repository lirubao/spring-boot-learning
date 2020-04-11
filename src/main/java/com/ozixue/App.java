package com.ozixue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * 配置扫描的包, 就可以加载到Controller中了
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.ozixue.web.controller")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
