package com.varun.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Varun Maurya on 8/28/2018.
 */
@RestController
@SpringBootApplication
public class Restaurant {

    @RequestMapping(value = "/menu")
    public String readingList(){
        return "Tea : $10 \n Coffee : $20 \n Juice : $30 \n Soda ; $2 ";
    }

    public static void main(String[] args) {
        SpringApplication.run(Restaurant.class, args);
    }
}