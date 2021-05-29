package com.ego.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ego.pojo.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
public interface UserMapper extends BaseMapper<UserInfo> {
    @Update("Update user_info set money=#{money} where account=#{account}")
    int updateUserMoney(@Param("account") String userName, @Param("money") Integer lastMoney);
    @Select("Select money from user_info")
    int selectUserMoney(@Param("account") String userName);
    @Select("Select * from user_info where account=#{account}")
    UserInfo selectUserByAccount(String account);
}
