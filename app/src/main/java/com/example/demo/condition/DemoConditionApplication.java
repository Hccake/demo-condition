package com.example.demo.condition;

import com.example.biz.service.AService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;


@SpringBootApplication(scanBasePackages = {"com.example.demo.condition", "com.example.biz.service"})
public class DemoConditionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConditionApplication.class, args);
    }


}
