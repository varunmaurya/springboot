package com.varun.swaggerapp.common.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by Varun Maurya on 2/11/2019.
 */
public class User {

    @ApiModelProperty(notes = "Name of the user")
    private String name;

    @ApiModelProperty(notes = "Role in the organization")
    private String role;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User(String name, String role) {
        this.name = name;
        this.role = role;
    }
}
