package com.unbong.javadevop.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConrtroller {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello java devops";
    }
}
