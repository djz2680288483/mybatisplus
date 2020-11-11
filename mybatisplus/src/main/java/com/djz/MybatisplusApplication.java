package com.djz;

import org.mybatis.spring.annotation.MapperScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan(value = "com.djz.mapper")
@SpringBootApplication
@EnableSwagger2
public class MybatisplusApplication {
    public static void main(String[] args) {

        SpringApplication.run(MybatisplusApplication.class, args);
    }


}
