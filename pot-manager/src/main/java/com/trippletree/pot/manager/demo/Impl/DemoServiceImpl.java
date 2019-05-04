package com.trippletree.pot.manager.demo.Impl;

import com.trippletree.pot.manager.demo.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String test() {
        return "test";
    }
}
