package com.orangefanpage.orangelogin.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fan_page")
public class FanPages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fan_page_title", nullable = false)
    private String fanPageTitle;

    @Column(name = "fan_page_URL", nullable = false)
    private String fanPageURL;
}
