package com.inetum.realdolmen;

import javax.enterprise.inject.Model;

@Model
public class HelloBean {

    private final String name = "Zaki";

    public String getName(){
        return name;
    }

}
