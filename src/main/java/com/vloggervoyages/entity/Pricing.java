package com.vloggervoyages.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Table(name = "pricing")
@Data
public class Pricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price_inr", precision = 10, scale = 2)
    private BigDecimal priceInr;

    private String pricingLabel;

    @Column(columnDefinition = "TEXT")
    private String inclusions;

    @Column(columnDefinition = "TEXT")
    private String exclusions;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
}
