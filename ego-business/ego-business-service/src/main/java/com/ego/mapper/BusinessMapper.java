package com.ego.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ego.pojo.LogInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Date;

/**
 * Created by 不要剁我爪 on 2021/3/30.
 */
public interface BusinessMapper extends BaseMapper<LogInfo> {

    @Insert("INSERT INTO log_info (id,content,createtime) VALUES (null,#{content},#{createtime})")
    int insertLog(@Param("content") String userName, @Param("createtime") Date date);
}
