package com.varun.circuitbreaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Varun Maurya on 8/28/2018.
 */
@EnableCircuitBreaker
@RestController
@SpringBootApplication
public class Caller {

    @Autowired
    private RestaurantService restaurantService;

    @Bean
    public RestTemplate rest(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/menu")
    public String menu() {
        return restaurantService.readingList();
    }

    public static void main(String[] args) {
        SpringApplication.run(Caller.class, args);
    }
}

