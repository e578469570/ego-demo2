package com.ego.service;

import com.ego.client.ItemFeignClient;
import com.ego.client.OrderFeignClient;
import com.ego.client.UserFeignClient;
import com.ego.mapper.BusinessMapper;
import com.ego.pojo.ItemInfo;
import com.ego.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BusinessService {

    @Autowired
    private BusinessMapper businessMapper;
    @Autowired
    private OrderFeignClient orderFeignClient;
    @Autowired
    private UserFeignClient userFeignClient;
    @Autowired
    private ItemFeignClient itemFeignClient;
    public boolean insertOrder(String userName, Integer itemId, Integer count) {
        try {
            Date date = new Date();
            //生成下单日志
            businessMapper.insertLog(userName,date);
            //查询单价
            ItemInfo itemInfo= itemFeignClient.selectItemById(itemId);
            int totalPrice=itemInfo.getPrice()*count;
            try {
                //下单
                orderFeignClient.addOrder(userName,totalPrice);
                //下库存
                int stock = itemInfo.getCount();
                int lastStock=stock-count;
                itemFeignClient.UpdateItem(itemId,lastStock);
                //扣款
                UserInfo userInfo = userFeignClient.selectUser(userName);
                int lastUserMoney=userInfo.getMoney()-totalPrice;
                userFeignClient.UpdateUser(userName,lastUserMoney);
            }catch (Exception e){
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

}
