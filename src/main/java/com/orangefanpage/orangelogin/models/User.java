package com.orangefanpage.orangelogin.models;


import jakarta.persistence.*;
import lombok.Data;

@Data //lombok automatically creates getter/setters/constructors
@Entity
@Table(name = "users") //JPA auto makes table in SQL
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name",nullable = false)
    private String lastName;

    @Column(name = "username",nullable = false)
    private String username;

}
