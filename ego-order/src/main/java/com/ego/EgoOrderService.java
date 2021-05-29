package com.ego;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ego.mapper")
public class EgoOrderService {
    public static void main(String[] args) {
        SpringApplication.run(EgoOrderService.class, args);
    }
}
