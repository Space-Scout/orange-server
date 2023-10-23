package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.Portfolios;
import com.orangefanpage.orangelogin.models.User;
import com.orangefanpage.orangelogin.repositories.PortfoliosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PortfoliosController {

    @Autowired
    private PortfoliosRepository portfoliosRepo;

    @GetMapping("/portfolios")
    private List<Portfolios> getAllPortfolios() {
        return portfoliosRepo.findAll();
    }

    @PostMapping("/portfolios")
    public Portfolios updatePortfolio(@RequestBody Portfolios portfolios) {
        Portfolios existingPortfolio = portfoliosRepo.findById(portfolios.getId()).get();
        existingPortfolio.setPortfolioName(portfolios.getPortfolioName());
        return portfoliosRepo.save(existingPortfolio);
    }

    @DeleteMapping("/portfolios/{id}")
    public void deletePortfolio(@PathVariable long id) {
        portfoliosRepo.deleteById(id);
    }
}

