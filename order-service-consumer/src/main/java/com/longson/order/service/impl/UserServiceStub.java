package com.longson.order.service.impl;

import com.longson.gamil.pojo.UserAddress;
import com.longson.gamil.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

public class UserServiceStub implements UserService {
    private final UserService userService;

    /*
    * 传入的是UserSevice远程的代理对象
    * */
    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }


    public List<UserAddress> getUserAddressList(String userId) {
        System.out.println("userServiceStub");
        if(!StringUtils.isEmpty(userId)){
            return  userService.getUserAddressList(userId);
        }
        return null;
    }
}
