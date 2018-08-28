package com.varun;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Varun Maurya on 8/27/2016.
 */

@RestController
public class RestService {

    @RequestMapping("/rest/")
    String home() {
        return "Hello World!";
    }
}