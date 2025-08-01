package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;


@RestController
public class UserController {


    @Autowired
    protected UserService userService;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody Users users){
        boolean ans= userService.addUser(users);
        if(ans){return "User added"; }
        return "User not added";
    }
}
