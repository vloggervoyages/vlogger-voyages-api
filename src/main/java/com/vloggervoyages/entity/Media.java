package com.vloggervoyages.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tour_id")
    private Long tourId;

    @Column(name = "media_type")
    private String mediaType;

    @Column(name = "media_url")
    private String mediaUrl;

    private Integer position;
}