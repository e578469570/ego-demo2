package com.ego.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("OrderService")
public interface OrderFeignClient {

    @PostMapping("order/{message}/{money}")
    void addOrder(@PathVariable(value = "message") String message, @PathVariable(value = "money") Integer money);
}
