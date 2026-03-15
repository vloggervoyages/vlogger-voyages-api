package com.vloggervoyages.graphql;

import com.vloggervoyages.entity.*;
import com.vloggervoyages.service.TourService;
import com.vloggervoyages.repository.*;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TourResolver {

    private final TourService tourService;
    private final ItineraryDayRepository itineraryDayRepository;
    private final PricingRepository pricingRepository;
    private final MediaRepository mediaRepository;

    /* -------------------------
       BASIC TOUR QUERIES
       ------------------------- */

    @QueryMapping
    public List<Tour> tours() {
        return tourService.getPublishedTours();
    }

    @QueryMapping
    public Tour tour(@Argument String slug) {
        return tourService.getBySlug(slug);
    }

    /* -------------------------
       FIELD RESOLVERS
       ------------------------- */

    @SchemaMapping(typeName = "Tour", field = "itineraryDays")
    public List<ItineraryDay> itineraryDays(Tour tour) {
        return itineraryDayRepository.findByTourId(tour.getId());
    }

    @SchemaMapping(typeName = "Tour", field = "pricing")
    public List<Pricing> pricing(Tour tour) {
        return pricingRepository.findByTourId(tour.getId());
    }

    @SchemaMapping(typeName = "Tour", field = "media")
    public List<Media> media(Tour tour) {
        return mediaRepository.findByTourId(tour.getId());
    }
}