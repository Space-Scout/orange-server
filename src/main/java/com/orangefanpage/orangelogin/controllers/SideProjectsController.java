package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.SideProjects;
import com.orangefanpage.orangelogin.repositories.SideProjectsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SideProjectsController {

    @Autowired
    private SideProjectsRepository sideProjectsRepo;

    @GetMapping("")
    private List<SideProjects> getAllSideProjects() {
        return sideProjectsRepo.findAll();
    }
}
