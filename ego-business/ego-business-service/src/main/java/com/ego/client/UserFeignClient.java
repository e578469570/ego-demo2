package com.ego.client;

import com.ego.pojo.UserInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("UserService")
public interface UserFeignClient {

    @GetMapping("user/{account}")
    public UserInfo selectUser(@PathVariable String account);
    @PutMapping("user/{account}/{count}")
    public void UpdateUser(@PathVariable String account, @PathVariable Integer count);
}
