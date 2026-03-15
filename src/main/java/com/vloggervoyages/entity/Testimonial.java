package com.vloggervoyages.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "testimonials")
@Data
public class Testimonial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String photoUrl;

    @Column(columnDefinition = "TEXT")
    private String review;

    private Integer rating;
    private String platform;

    private LocalDateTime createdAt;
}
