package com.varun.shutdown;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration
@SpringBootApplication
@EnableScheduling
@ComponentScan("com/varun/")

public class ShutDown {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ShutDown.class, args);
    }

}