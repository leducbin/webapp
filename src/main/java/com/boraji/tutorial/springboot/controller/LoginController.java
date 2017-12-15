package com.boraji.tutorial.springboot.controller;

import com.boraji.tutorial.springboot.entity.mysql.Task;
import com.boraji.tutorial.springboot.entity.mysql.UserDetails;
import com.boraji.tutorial.springboot.entity.postgresql.User;
import com.boraji.tutorial.springboot.service.UserService;
import com.boraji.tutorial.springboot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @Autowired
    private UsersService usersService;

    @PostMapping("/login")
    public List<UserDetails> addBook(@RequestParam Map<String, String> body)
    {
        UserDetails userDetails = new UserDetails();
        userDetails.setName(body.get("name"));
        userDetails.setUsername(body.get("username"));
        userDetails.setEmail(body.get("email"));
        userDetails.setPassword(body.get("password"));
        userDetails.setAddress(body.get("address"));
        userDetails.setToken("dasgfshrgfhwdfergh");
        return userService.addUser(userDetails);
    }

    @GetMapping("/login")
    public List<UserDetails> getAll()
    {
        return userService.getAll();
    }

    @PostMapping("/registerpg")
    public List<User> addUsers(@RequestParam Map<String, String> body)
    {
        User userDetails = new User();
        userDetails.setName(body.get("name"));
        userDetails.setUsername(body.get("username"));
        userDetails.setEmail(body.get("email"));
        userDetails.setPassword(body.get("password"));
        userDetails.setAddress(body.get("address"));
        userDetails.setToken("dasgfshrgfhwdfergh");
        return usersService.addUsers(userDetails);
    }

    @GetMapping("/")
    public String getUser()
    {
        return "Hello";
    }
}
