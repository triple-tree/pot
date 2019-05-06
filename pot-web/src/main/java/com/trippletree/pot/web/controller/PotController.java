package com.trippletree.pot.web.controller;

import com.trippletree.pot.domain.user.User;
import com.trippletree.pot.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PotController {

    @Autowired
    private UserService userService;

    @RequestMapping("pot")
    public String test() {
        return userService.getAllUsers();
    }


    @RequestMapping(value = "/showUser")
    public List<User> getUser(){
        return  userService.findAll();
    }
}