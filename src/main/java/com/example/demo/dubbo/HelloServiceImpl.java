package com.example.demo.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by lichujun on 2018-05-28.
 */
@Component
public class HelloServiceImpl {
    @Reference
    private HelloService helloService;
    public String say(){
        return helloService.hello();
    }
}