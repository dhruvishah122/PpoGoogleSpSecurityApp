package com.ppo.google.ppoGoogleSpSecurity.controller;

import com.ppo.google.ppoGoogleSpSecurity.model.Users;
import com.ppo.google.ppoGoogleSpSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        userService.register(user);
        return user;
    }
    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return userService.verify(user);
    }
}
