package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.User;
import com.orangefanpage.orangelogin.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/{user_id}")
    public User getUserById(@PathVariable ("user_id") long id){
        return userRepo.findById(id).orElse(null);
    }

    // @PostMapping("")
    // public User createUser(@RequestBody User user) {
    
    // }

    //createUser
    //deleteUser
    //updateUser
    //updatefanpage
    //updatefanpageSubject

}
