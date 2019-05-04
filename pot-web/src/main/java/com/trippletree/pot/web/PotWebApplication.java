package com.trippletree.pot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.trippletree.pot")
public class PotWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(PotWebApplication.class, args);
    }

}
