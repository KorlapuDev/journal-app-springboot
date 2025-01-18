package com.abhi.journalapplication.controller;

import com.abhi.journalapplication.entity.Users;
import com.abhi.journalapplication.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UsersServices usersServices;

    @PostMapping
    public boolean createNewUser(@RequestBody Users newUser){
        usersServices.createUser(newUser);
        return true;
    }
}
