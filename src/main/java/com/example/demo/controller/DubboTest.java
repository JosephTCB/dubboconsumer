package com.example.demo.controller;

import com.example.demo.service.HelloConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lichujun on 2018-05-28.
 */
@RestController
public class DubboTest {
    private HelloConsumer helloConsumer;

    @Autowired
    public DubboTest(HelloConsumer helloConsumer){
        this.helloConsumer = helloConsumer;
    }

    @RequestMapping("/hello")
    public String hello(){
        helloConsumer.say();
        return "hello";
    }
}
