package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.FanPages;
import com.orangefanpage.orangelogin.models.Portfolios;
import com.orangefanpage.orangelogin.repositories.FanPagesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FanPagesController {

    @Autowired
    private FanPagesRepository fanPageRepo;

    @GetMapping("")
    private List<FanPages> getAllFanPages() {
        return fanPageRepo.findAll();
    }

    @PostMapping("")
    public FanPages updateFanPage(@RequestBody FanPages fanPages) {
        FanPages existingFanPage = fanPageRepo.findById(fanPages.getId()).get();
        existingFanPage.setFanPageTitle(fanPages.getFanPageTitle());
        existingFanPage.setFanPageURL(fanPages.getFanPageURL());
        return fanPageRepo.save(existingFanPage);
    }

    @DeleteMapping("/{id}")
    public void deleteFanPage(@PathVariable long id) {
        fanPageRepo.deleteById(id);
    }
}
