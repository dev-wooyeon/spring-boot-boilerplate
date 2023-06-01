package com.boilerplate.springbootreactweb.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class WelcomeController {

    @GetMapping("/api/hello")
    public String test(){
        return "Hello, React Java Boiler Plate";
    }

}
