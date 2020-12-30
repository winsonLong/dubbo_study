package com.longson;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.longson.bootserviceorderconsumer","com.longson." +
        "controller"})
@EnableDubbo
public class BootServiceOrderConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootServiceOrderConsumerApplication.class, args);
    }

}
