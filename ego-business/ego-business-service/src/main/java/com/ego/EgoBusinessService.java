package com.ego;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.ego.mapper")
@EnableFeignClients // 开启Feign功能
public class EgoBusinessService {
    public static void main(String[] args) {
        SpringApplication.run(EgoBusinessService.class, args);
    }
}
