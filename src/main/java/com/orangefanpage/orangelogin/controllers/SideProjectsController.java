/*
package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.FanPages;
import com.orangefanpage.orangelogin.models.SideProjects;
import com.orangefanpage.orangelogin.repositories.SideProjectsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SideProjectsController {

    @Autowired
    private SideProjectsRepository sideProjectsRepo;

    @GetMapping("")
    private List<SideProjects> getAllSideProjects() {
        return sideProjectsRepo.findAll();
    }

    @PostMapping("")
    public SideProjects updateSideProject(@RequestBody SideProjects sideProjects) {
        SideProjects existingSideProjects = sideProjectsRepo.findById(sideProjects.getId()).get();
        existingSideProjects.setSideProjectTitle(sideProjects.getSideProjectTitle());
        existingSideProjects.setSideProjectURL(sideProjects.getSideProjectURL());
        return sideProjectsRepo.save(existingSideProjects);
    }

    @DeleteMapping("/{id}")
    public void deleteSideProjects(@PathVariable long id) {
        sideProjectsRepo.deleteById(id);
    }
}
*/
