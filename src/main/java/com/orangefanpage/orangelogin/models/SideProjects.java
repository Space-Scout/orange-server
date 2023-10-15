package com.orangefanpage.orangelogin.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "side_projects")
public class SideProjects {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "side_project_title", nullable = false)
    private String sideProjectTitle;

    @Column(name = "side_project_URL", nullable = false)
    private String sideProjectURL;

/*    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; //reference to user*/

}