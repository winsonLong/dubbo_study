package com.longson.bootuserservicepovider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
* 1.导入依赖
* 1）导入dubbo-starter
* 2)导入bubbo的其他依赖
* */
@EnableDubbo
@SpringBootApplication
@ComponentScan(basePackages = {"com.longson.bootuserservicepovider.*"})
public class BootUserServicePoviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootUserServicePoviderApplication.class, args);
    }

}
