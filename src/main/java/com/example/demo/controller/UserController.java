package com.example.demo.controller;

import com.example.demo.entity.Users;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



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

    @PutMapping ("/updateUser")
    public String updateUser(@RequestBody Users users){
        boolean ans= userService.addUser(users);
        if(ans){return "User deleted"; }
        return "User not deleted";

    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestBody Users users) {
        boolean ans = userService.addUser(users);
        if (ans) {
            return "User updated";
        }
        return "User not updated";
    }




    @GetMapping("/allUser")
    public String getAllUser(@RequestBody Users users) {
        boolean ans = userService.addUser(users);
        if (ans) {
            return "User ";
        }
        return "Users not found";
    }

    @GetMapping("/viewUser")
    public String viewUser(@RequestBody Users users) {
        System.out.println("Hello");
        boolean ans = userService.addUser(users);
        if (ans) {
            return "User";
        }
        return "User not found";
    }

}
