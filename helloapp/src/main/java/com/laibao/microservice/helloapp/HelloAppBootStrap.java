package com.laibao.microservice.helloapp;

import org.springframework.boot.SpringApplication;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class HelloAppBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(HelloAppConfiguration.class,args);
        //SpringApplication application = new SpringApplication();
        //application.setMainApplicationClass(HelloAppConfiguration.class);
        //application.run(args);
    }
}
