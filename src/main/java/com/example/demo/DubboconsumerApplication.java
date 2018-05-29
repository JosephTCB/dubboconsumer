package com.example.demo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboconsumerApplication {

	public static void main(String[] args) {
		/*ConfigurableApplicationContext run = SpringApplication.run(DubboconsumerApplication.class, args);
		IHelloService iHelloService = run.getBean(IHelloService.class);
		System.out.println(iHelloService.hello());*/
		SpringApplication.run(DubboconsumerApplication.class, args);
	}
}
