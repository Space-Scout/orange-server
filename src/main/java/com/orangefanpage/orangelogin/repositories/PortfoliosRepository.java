package com.orangefanpage.orangelogin.repositories;

import com.orangefanpage.orangelogin.models.Portfolios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfoliosRepository extends JpaRepository <Portfolios, Long> {
    // <Portfolios, Long> Portfolios is the class and Long is the type of ID for the repository
}
