package com.longson.bootserviceorderconsumer;

import com.longson.gamil.pojo.UserAddress;
import com.longson.gamil.service.OrderService;
import com.longson.gamil.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    //@Autowired
    @Reference
    UserService userService;

    public List<UserAddress> initOrder(String userID) {

        System.out.println("用户ID"+userID);
        //查询用户的收货地址
        List<UserAddress> addressesList=userService.getUserAddressList(userID);

        return addressesList;
    }
}