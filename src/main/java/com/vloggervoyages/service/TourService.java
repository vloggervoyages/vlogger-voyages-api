package com.vloggervoyages.service;

import com.vloggervoyages.entity.Tour;
import com.vloggervoyages.entity.TourStatus;
import com.vloggervoyages.repository.TourRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TourService {

    private final TourRepository tourRepository;

    public List<Tour> getPublishedTours() {
        return tourRepository.findByStatus(TourStatus.PUBLISHED);
    }

    public Tour getBySlug(String slug) {
        return tourRepository.findBySlug(slug).orElse(null);
    }
}