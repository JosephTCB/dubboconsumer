package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by lichujun on 2018-05-28.
 */
@Component
public class HelloConsumer {
    @Reference(url = "dubbo://127.0.0.1:20880")
    private IHelloService iHelloService;
    public void say(){
        System.out.println(iHelloService.hello());
    }
}