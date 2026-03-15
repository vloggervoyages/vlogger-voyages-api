package com.vloggervoyages.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Entity
@Table(name = "itinerary_days")
@Data
public class ItineraryDay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer dayNumber;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private LocalTime startTime;
    private LocalTime endTime;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
}
