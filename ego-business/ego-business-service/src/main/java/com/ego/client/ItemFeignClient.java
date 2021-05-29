package com.ego.client;

import com.ego.pojo.ItemInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient("ItemService")
public interface ItemFeignClient {

    @GetMapping("/item/{id}")
    ItemInfo selectItemById(@PathVariable(value = "id") Integer id) ;
    @PutMapping("/item/{id}/{count}")
    void UpdateItem(@PathVariable Integer id, @PathVariable Integer count);

}
