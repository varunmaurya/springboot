package com.varun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Varun Maurya on 8/27/2016.
 */
@SpringBootApplication
@EnableAutoConfiguration
/**
 * Execute this class to start the spring boot application which automatically looks for
 * all the beans or apring components to be initialized, Like in our case it will start
 * a Rest service at default port 8080 which would return "Hello World" at this url
 * http://localhost:8080/rest/
 *
 */
public class HelloWorld {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorld.class,args);
    }
}
