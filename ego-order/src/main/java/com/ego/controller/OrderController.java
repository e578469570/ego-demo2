package com.ego.controller;

import com.ego.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
        private OrderService orderService;

    @PostMapping("/{message}/{money}")
    public void addOrder(@PathVariable String message, @PathVariable Integer money){
       orderService.addOrder(message, money);
    }
}
