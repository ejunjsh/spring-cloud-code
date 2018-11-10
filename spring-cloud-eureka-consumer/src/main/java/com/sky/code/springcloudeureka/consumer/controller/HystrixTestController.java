package com.sky.code.springcloudeureka.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hystrix")
public class HystrixTestController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    public String index() {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/hello",String.class);
    }

    @HystrixCommand(fallbackMethod = "crash")
    @RequestMapping("/error")
    public String error() {
         throw new RuntimeException();
    }

    @HystrixCommand(fallbackMethod = "crash")
    @RequestMapping("/timeout")
    public String timeout() {
        try {
            Thread.sleep(60000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "";
    }

    @HystrixCommand(fallbackMethod = "crash")
    @RequestMapping("/nonresponse")
    public String nonrespone() {
        return restTemplate.getForObject("http://NON-EXISTING-SERVER/hello",String.class);
    }

    public String crash(){
        return "server have been crash, try again later.";
    }
}