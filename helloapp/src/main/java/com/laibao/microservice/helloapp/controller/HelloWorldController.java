package com.laibao.microservice.helloapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
@RestController
@RequestMapping("/helloapp")
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayGreeting() {
        return "hello,nice to meet you, welcome to Spring boot world!";
    }
}
