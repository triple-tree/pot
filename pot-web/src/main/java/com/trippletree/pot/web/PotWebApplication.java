package com.trippletree.pot.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.trippletree.pot")
@MapperScan("com.trippletree.pot.dao")
public class PotWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PotWebApplication.class, args);
    }

}
