package com.orangefanpage.orangelogin.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data //lombok automatically creates getter/setters/constructors
@Entity
@Table(name = "users") //JPA auto makes table in SQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "username",nullable = false)
    private String username;

    @Column(name = "linkedIn",nullable = true)
    private String linkedIn;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    //mappedBy = bidirectional relationship (owning side is on the many side of relationship)
    @JoinColumn(name = "portfolios_id")
    private List<Portfolios> portfolios =  new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,  mappedBy = "user")
    @JoinColumn(name = "fan_pages_id")
    private List<FanPages> fanPages = new ArrayList<>();

}
