package com.varun.circuitbreaker;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by Varun Maurya on 8/28/2018.
 */


@Service
public class RestaurantService {


    private final RestTemplate restTemplate;

    public RestaurantService(RestTemplate rest) {
        this.restTemplate = rest;
    }

    @HystrixCommand(fallbackMethod = "default_menu")
    public String readingList() {
        URI uri = URI.create("http://localhost:8090/menu");

        return this.restTemplate.getForObject(uri, String.class);
    }

    public String default_menu() {
        return "Tea : $10 \n Coffer : $20";
    }

}