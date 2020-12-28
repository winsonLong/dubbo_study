package com.longson.gamil.service;

import com.longson.gamil.pojo.UserAddress;

import java.util.List;

public interface OrderService {
    /**
     * 初始化订单
     *
     * @param userID
     */
    public List<UserAddress> initOrder(String userID);
}