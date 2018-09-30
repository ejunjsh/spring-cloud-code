package com.sky.code.springcloudconfig.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        System.setProperty("spring.config.name","configserver");
        SpringApplication.run(Application.class, args);
    }
}
