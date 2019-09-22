package com.ziw.demo0921;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.ziw.demo0921.dao"}) //扫描DAO
public class Demo0921Application {

    public static void main(String[] args) {

        SpringApplication.run(Demo0921Application.class, args);
    }

}
