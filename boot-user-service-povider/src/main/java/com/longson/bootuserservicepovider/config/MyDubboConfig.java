package com.longson.bootuserservicepovider.config;

import com.alibaba.dubbo.config.*;
import com.longson.gamil.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;


public class MyDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig=new ApplicationConfig();
        applicationConfig.setName("service");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig=new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig(){
        ProtocolConfig protocolConfig=new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

    public ServiceConfig<UserService> serviceConfig(UserService userService){
        ServiceConfig serviceConfig=new ServiceConfig();
        serviceConfig.setInterface("com.longson.gamil.service.UserService");
        serviceConfig.setRef(userService);
        serviceConfig.setVersion("*");

        //配置每一个method的信息
        MethodConfig methodConfig=new MethodConfig();
        methodConfig.setName("getUserAddressList");
        methodConfig.setTimeout(1000);

        List<MethodConfig> methods=new ArrayList<MethodConfig>();
        methods.add(methodConfig);

        //将method的设置保存到service配置
        serviceConfig.setMethods(methods);
        return serviceConfig;
    }

}
