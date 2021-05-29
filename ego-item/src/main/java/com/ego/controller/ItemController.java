package com.ego.controller;

import com.ego.pojo.ItemInfo;
import com.ego.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
@RestController
@RequestMapping("/item")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping("/{id}")
    public ItemInfo selectItemById(@PathVariable(value = "id") Integer id) {
        return itemService.selectItem(id);
    }
    @PutMapping("/{id}/{count}")
    public void UpdateItem(@PathVariable(value = "id") Integer id, @PathVariable(value = "count") Integer count) {
        itemService.updateItem(id, count);
    }


}
