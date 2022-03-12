package com.strr.demo;

import com.strr.demo.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
    @DubboReference(version = "1.0.0", url = "dubbo://localhost:12345")
    private DemoService demoService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> {
            System.out.println(demoService.sayHello("strr"));
        };
    }
}
