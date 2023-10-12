package com.orangefanpage.orangelogin.repositories;

import com.orangefanpage.orangelogin.models.SideProjects;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SideProjectsRepository extends JpaRepository <SideProjects, Long> {
    // <SideProjects, Long> SideProjects is the class and Long is the type of ID for the repository
}
