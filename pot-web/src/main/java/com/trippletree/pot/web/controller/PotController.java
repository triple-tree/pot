package com.trippletree.pot.web.controller;

import com.trippletree.pot.manager.demo.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PotController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("pot")
    public String test() {
        return demoService.test();
    }
}