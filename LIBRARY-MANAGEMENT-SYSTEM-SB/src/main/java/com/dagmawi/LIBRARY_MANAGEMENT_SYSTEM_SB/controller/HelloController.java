package com.dagmawi.LIBRARY_MANAGEMENT_SYSTEM_SB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(){
        return "Welcome to dagi's web application ! aaaa";
    }



}
