package com.vloggervoyages.repository;

import com.vloggervoyages.entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PricingRepository extends JpaRepository<Pricing, Long> {

    List<Pricing> findByTourId(Long tourId);
}