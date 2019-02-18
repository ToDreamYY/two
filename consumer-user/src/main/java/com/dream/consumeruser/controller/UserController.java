package com.dream.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/buy")
    public String buyTicket(){
        String s = restTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        System.out.println("第一次上传成功");
        return "购买了"+s;
    }
}
