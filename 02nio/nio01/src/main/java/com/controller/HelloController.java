package com.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")

@Slf4j
public class HelloController {

    // http://localhost:8081/hello
    @GetMapping
    public String sayHello() {
        log.info("HelloController-->sayHello()...");
        return "Hello, For nio01!";
    }

}
