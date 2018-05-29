package com.example.demo.controller;

import com.example.demo.dubbo.HelloServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lichujun on 2018-05-28.
 */
@RestController
public class DubboTest {
    private HelloServiceImpl helloServiceImpl;

    @Autowired
    public DubboTest(HelloServiceImpl helloServiceImpl){
        this.helloServiceImpl = helloServiceImpl;
    }

    @RequestMapping("/hello")
    public String hello(){
        return helloServiceImpl.say();
    }
}
