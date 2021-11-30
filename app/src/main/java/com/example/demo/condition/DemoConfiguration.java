package com.example.demo.condition;

import com.example.biz.service.AService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author hccake
 */
@Configuration
public class DemoConfiguration {

    @Bean
    @ConditionalOnBean(AService.class)
    public AController aController(AService aService){
        return new AController(aService);
    }

}
