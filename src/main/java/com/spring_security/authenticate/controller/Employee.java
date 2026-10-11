package com.spring_security.authenticate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/welcome")
public class Employee {


    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }
    @GetMapping("/hi")
    public String hi()
    {
        return "hi";
    }
}
