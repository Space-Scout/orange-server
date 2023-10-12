package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.FanPages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FanPagesController {

    @Autowired
    private FanPagesRepository fanPageRepo;

    @GetMapping("")
    private List<FanPages> getAllFanPages() {
        return fanPageRepo.findAll();
    }
}
