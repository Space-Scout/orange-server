package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.Portfolios;
import com.orangefanpage.orangelogin.models.User;
import com.orangefanpage.orangelogin.repositories.PortfoliosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PortfoliosController {

    @Autowired
    private PortfoliosRepository portfolioRepo;

    @GetMapping("")
    private List<Portfolios> getAllPortfolios() {
        return portfolioRepo.findAll();
    }
}
