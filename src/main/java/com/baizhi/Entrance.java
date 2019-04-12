package com.baizhi;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.baizhi.dao")
public class Entrance {
    public static void main(String[] args) {
        SpringApplication.run(Entrance.class,args);
    }
}
