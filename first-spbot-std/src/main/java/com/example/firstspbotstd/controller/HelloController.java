package com.example.firstspbotstd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // http://localhost:8999/hello

    // http://localhost:8999/hello?name=zhangsan

    // http://localhost:8999/hello?name=zhangsan&age=18

    // @GetMapping("/hello")
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello() {
        return "Hello SpringBoot!";
    }
}
