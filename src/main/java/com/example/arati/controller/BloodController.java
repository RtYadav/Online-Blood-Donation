package com.example.arati.controller;

import com.example.arati.model.User;
import com.example.arati.repository.BloodRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class BloodController {

    @Autowired
    BloodRepo bloodRepo;

    /*@GetMapping(value = "get")
    public String getUser(){
        return "sssss";
    }
    */

    //Register user(url = http://localhost:8085/api/save)

    @PostMapping(value="/save")
    public String registerUser(@RequestBody User user){
        bloodRepo.save(user);
       return "Successfully registered " ;
    }

    //Fetch data(http://localhost:8085/api/getUser)

    @GetMapping("/getUser")
    public User findUser(){
        return (User) bloodRepo.findAll();
    }
}
