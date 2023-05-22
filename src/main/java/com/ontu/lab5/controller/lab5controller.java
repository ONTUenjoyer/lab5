package com.ontu.lab5.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class lab5controller
{
    @GetMapping("/hello-world")
    public String HelloWorld()
    {
        return "It's works!";
    }
}

