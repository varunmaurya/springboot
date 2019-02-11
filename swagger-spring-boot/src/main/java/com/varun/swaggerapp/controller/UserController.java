package com.varun.swaggerapp.controller;

import com.varun.swaggerapp.common.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Varun Maurya on 2/11/2019.
 */
@RestController
@RequestMapping("/users/")
@Api(value = "User Resources" , description = "This has all user specific apis")
public class UserController {

    @ApiOperation(value = "This returns all users")
    @ApiResponses(value = {@ApiResponse(code = 200,message = "It means a successful response"),
            @ApiResponse(code= 404, message = "No such endpoint exist"),
            @ApiResponse(code= 401, message = "UnAuthorized user")})
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return Arrays.asList(
                new User("Varun","Admin"),
                new User("Coby","SuperAdmin")
        );
    }

    @ApiOperation(value = "This returns user information")
    @ApiResponses(value = {@ApiResponse(code = 200,message = "It means a successful response"),
            @ApiResponse(code= 404, message = "No such endpoint exist"),
            @ApiResponse(code= 401, message = "UnAuthorized user")})
    @GetMapping("/{name}")
    public User getUser(@PathVariable String name){
        return new User(name,"DEFAULT");
    }
}
