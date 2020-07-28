package com.duing;

import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class ConsumerApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @DubboReference(version = "${demo.service.version}")
    private DemoService demoService;

    public static void main(String[] args) {
//        SpringApplication.run(ConsumerApplication.class).close();
        SpringApplication.run(ConsumerApplication.class,args);
    }

    @Bean
    public ApplicationRunner runner() {
        return args -> logger.info(demoService.sayHello("hello dubbo"));
    }
}
