package com.ego.service;

import com.ego.mapper.OrderMapper;
import com.ego.pojo.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class OrderService {

    @Autowired
    private OrderMapper orderMapper;
    public void addOrder(String userName,Integer money){
        OrderInfo orderInfo = new OrderInfo();
//        orderInfo.setId(null);
        orderInfo.setMoney(money);
        orderInfo.setMessage(userName);
        orderMapper.insertALog(userName,money);

    }
}
