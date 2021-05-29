package com.ego.controller;

import com.ego.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
@Controller
@RequestMapping("/business")
public class BusinessController {
    @Autowired
        private BusinessService businessService;

        @RequestMapping("/addorder")
        public ResponseEntity<Object> addOrder(@RequestParam(value = "username") String userName,
                @RequestParam(value = "itemid") Integer itemId,
                @RequestParam(value = "count") Integer count) {
            Boolean msg = this.businessService.insertOrder(userName, itemId, count);
            HashMap<Object,Object> map = new HashMap<>();
            if (msg.equals(true)) {
                map.put("result",true);
                return ResponseEntity.status(200).body(map);
            } else {
                //响应400
                map.put("result",false);
                return ResponseEntity.status(400).body(map);
            }
    }

}
