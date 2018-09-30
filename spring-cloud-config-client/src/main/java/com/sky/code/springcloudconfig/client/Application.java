package com.sky.code.springcloudconfig.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@RestController
public class Application {

    @Value("${hello.world}")
    String name;

    @RequestMapping("/")
    public String home() {
        return name;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
