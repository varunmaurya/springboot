package com.varun.swaggerapp.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Varun Maurya on 1/28/2019.
 */
@RestController
@RequestMapping("/rest")
@Api(value = "Data Resources" , description = "This has all data specific apis")
public class DataController {
    Logger log = LoggerFactory.getLogger(DataController.class);

    @ApiOperation(value = "This handles get request")
    @ApiResponses(value = {@ApiResponse(code = 200,message = "It means a successful response"),
                           @ApiResponse(code= 404, message = "No such endpoint exist")})
    @GetMapping("/")
    String home() {
        return "Get Called";
    }

    @ApiOperation(value = "This handles post request")
    @ApiResponses(value = {@ApiResponse(code = 200,message = "It means a successful response"),
            @ApiResponse(code= 404, message = "No such endpoint exist")})
    @PostMapping("/post/")
    String homepost(){
        return "post called";
    }

    @ApiOperation(value = "This handles put request")
    @ApiResponses(value = {@ApiResponse(code = 200,message = "It means a successful response"),
            @ApiResponse(code= 404, message = "No such endpoint exist")})
    @PostMapping("/put/")
    String homeput(){
        return "put called";
    }

    @ApiOperation(value = "This handles delete request")
    @ApiResponses(value = {@ApiResponse(code = 200,message = "It means a successful response"),
            @ApiResponse(code= 404, message = "No such endpoint exist")})
    @PostMapping("/delete/")
    String homedelete(){
        return "delete called";
    }
}
