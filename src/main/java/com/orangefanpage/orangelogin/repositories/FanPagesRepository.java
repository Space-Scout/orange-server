package com.orangefanpage.orangelogin.repositories;

import com.orangefanpage.orangelogin.models.FanPages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FanPagesRepository extends JpaRepository <FanPages, Long> {
    // <FanPages, Long> FanPages is the class and Long is the type of ID for the repository
}
