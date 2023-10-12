package com.orangefanpage.orangelogin.models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "portfolios")
public class Portfolios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "portfolio_name", nullable = false)
    private String portfolioName;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user; //reference to user
}
