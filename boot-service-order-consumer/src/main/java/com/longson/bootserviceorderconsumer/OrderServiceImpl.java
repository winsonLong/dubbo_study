package com.longson.bootserviceorderconsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.longson.gamil.pojo.UserAddress;
import com.longson.gamil.service.OrderService;
import com.longson.gamil.service.UserService;

import org.springframework.stereotype.Component;

import java.util.List;


@Component
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