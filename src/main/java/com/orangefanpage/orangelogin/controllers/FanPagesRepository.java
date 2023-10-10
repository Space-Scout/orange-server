package com.orangefanpage.orangelogin.controllers;

import com.orangefanpage.orangelogin.models.FanPages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FanPagesRepository extends JpaRepository <FanPages, Long> {
    // <FanPages, Long> Portfolios is the class and Long is the type of ID for the repository
}
