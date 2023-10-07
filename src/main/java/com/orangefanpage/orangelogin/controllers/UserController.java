package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @GetMapping("")
    private List<User> getAllUsers(){
        return userRepo.findAll();
    }
}
