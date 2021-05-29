package com.ego.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ego.pojo.ItemInfo;
import com.ego.pojo.LogInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
public interface ItemMapper extends BaseMapper<ItemInfo> {

    @Update("Update item_info set count=#{count} where id=#{id}")
    void updateCount(@Param("id") Integer id, @Param("count") Integer count);
    @Select("Select price from item_info")
    int selectPrice(@Param("id") Integer id);
    @Select("Select count from item_info")
    int selectCount(@Param("id") Integer id);
}
