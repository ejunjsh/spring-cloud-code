package com.sky.code.springcloudeureka.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String index() throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();

        return "hello world and I'm in "+ia.getHostName();
    }
}