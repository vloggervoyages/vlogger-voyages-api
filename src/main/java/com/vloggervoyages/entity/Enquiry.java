package com.vloggervoyages.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "enquiries")
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tour_id")
    private Long tourId;

    private String name;

    private String email;

    private String phone;

    private String message;

    private String source;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}