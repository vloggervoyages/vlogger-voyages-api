package com.vloggervoyages.repository;

import com.vloggervoyages.entity.Tour;
import com.vloggervoyages.entity.TourStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TourRepository extends JpaRepository<Tour, Long> {

    Optional<Tour> findBySlug(String slug);

    List<Tour> findByStatus(TourStatus status);
}