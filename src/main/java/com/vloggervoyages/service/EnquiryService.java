package com.vloggervoyages.service;

import com.vloggervoyages.entity.Enquiry;
import com.vloggervoyages.graphql.input.EnquiryInput;
import com.vloggervoyages.repository.EnquiryRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnquiryService {

    private final EnquiryRepository enquiryRepository;

    public List<Enquiry> getAll() {
        return enquiryRepository.findAll();
    }

    public Enquiry save(EnquiryInput input) {

        Enquiry enquiry = new Enquiry();

        enquiry.setTourId(input.getTourId());
        enquiry.setName(input.getName());
        enquiry.setEmail(input.getEmail());
        enquiry.setPhone(input.getPhone());
        enquiry.setMessage(input.getMessage());
        enquiry.setSource(input.getSource());
        enquiry.setCreatedAt(LocalDateTime.now());

        return enquiryRepository.save(enquiry);
    }
}