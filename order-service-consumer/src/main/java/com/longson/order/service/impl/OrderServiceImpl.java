package com.longson.order.service.impl;

import com.longson.gamil.pojo.UserAddress;
import com.longson.gamil.service.OrderService;
import com.longson.gamil.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(String userID) {

        System.out.println("用户ID"+userID);
        //查询用户的收货地址
        List<UserAddress> addressesList=userService.getUserAddressList(userID);

        for(UserAddress a:addressesList){
            System.out.println(a.getUserAddress());
        }
    }
}