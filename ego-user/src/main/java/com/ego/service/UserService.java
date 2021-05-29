package com.ego.service;

import com.ego.mapper.UserMapper;
import com.ego.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void updateUser(String account, Integer money) {
        userMapper.updateUserMoney(account, money);
    }

    public UserInfo selectUser(String account) {
        return userMapper.selectUserByAccount(account);
    }
}
