package com.yc89.auth.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        return "Hello World";
    }
}
