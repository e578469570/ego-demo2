package com.ego.controller;

import com.ego.pojo.UserInfo;
import com.ego.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping("/{account}/{money}")
    public void UpdateUser(@PathVariable String account, @PathVariable Integer money) {
        userService.updateUser(account, money);
    }

    @GetMapping("/{account}")
    public UserInfo selectUser(@PathVariable String account) {
        return userService.selectUser(account);
    }
}
