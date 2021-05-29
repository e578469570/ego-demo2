package com.ego;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ego.mapper")
public class EgoItemService {
    public static void main(String[] args) {
        SpringApplication.run(EgoItemService.class, args);
    }
}
