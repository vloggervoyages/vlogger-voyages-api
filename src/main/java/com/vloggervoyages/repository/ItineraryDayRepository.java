package com.vloggervoyages.repository;

import com.vloggervoyages.entity.ItineraryDay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItineraryDayRepository extends JpaRepository<ItineraryDay, Long> {

    List<ItineraryDay> findByTourId(Long tourId);
}