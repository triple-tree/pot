package com.trippletree.pot.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pot")
public class PotController {

    @GetMapping("test")
    public String test() {
        return "Hello World!";
    }
}