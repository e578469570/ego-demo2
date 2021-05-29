package com.ego.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ego.pojo.OrderInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
public interface OrderMapper extends BaseMapper<OrderInfo> {
    @Insert("INSERT INTO order_info (id,message,money) VALUES (null,#{message},#{money})")
    int insertALog(@Param("message") String message, @Param("money") Integer money);
}
