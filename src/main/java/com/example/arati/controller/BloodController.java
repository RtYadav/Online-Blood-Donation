package com.example.arati.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class BloodController {

    @GetMapping(value = "get")

    public String getUser(){
        return "sssss";
    }
}
