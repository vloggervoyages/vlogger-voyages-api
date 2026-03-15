package com.vloggervoyages.repository;

import com.vloggervoyages.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MediaRepository extends JpaRepository<Media, Long> {

    List<Media> findByTourId(Long tourId);
}