package com.boraji.tutorial.springboot.controller;

import com.boraji.tutorial.springboot.entity.mysql.Task;
import com.boraji.tutorial.springboot.entity.mysql.UserDetails;
import com.boraji.tutorial.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Task addBook(@RequestParam Map<String, String> body)
    {
        UserDetails userDetails = new UserDetails();
        userDetails.setId(1);
        userDetails.setName(body.get("name"));
        userDetails.setUsername(body.get("username"));
        userDetails.setEmail(body.get("email"));
        userDetails.setPassword(body.get("password"));
        userDetails.setAddress(body.get("address"));
        userDetails.setToken("dasgfshrgfhwdfergh");
        return userService.addUser(userDetails);
    }
}
