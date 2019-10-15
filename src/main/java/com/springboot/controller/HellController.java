package com.springboot.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @RequestMapping("/sayHello")
    public String sayHello(){
        return name+" say hello!";
    }
}
