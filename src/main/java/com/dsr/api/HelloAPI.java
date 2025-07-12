package com.dsr.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloAPI {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }
}