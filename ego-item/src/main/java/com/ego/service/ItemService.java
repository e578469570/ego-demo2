package com.ego.service;

import com.ego.mapper.ItemMapper;
import com.ego.pojo.ItemInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public void updateItem(Integer id, Integer count) {
        itemMapper.updateCount(id,count);

    }

    public ItemInfo selectItem(Integer id) {
       return itemMapper.selectById(id);
    }
}
