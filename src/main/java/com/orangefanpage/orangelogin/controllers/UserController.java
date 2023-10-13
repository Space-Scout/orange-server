package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.User;
import com.orangefanpage.orangelogin.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public User getUserById(@PathVariable long id){
        return userRepo.findById(id).orElse(null);
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PostMapping("/users")
    public User updateUser(@RequestBody User user) {
        User existingUser = userRepo.findById(user.getId()).get();
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setUsername(user.getUsername());
        existingUser.setLinkedIn(user.getLinkedIn());
        return userRepo.save(existingUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable long id) {
        userRepo.deleteById(id);
    }
}
