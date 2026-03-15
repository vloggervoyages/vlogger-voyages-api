package com.vloggervoyages.graphql;

import com.vloggervoyages.entity.Enquiry;
import com.vloggervoyages.service.EnquiryService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.Argument;
import com.vloggervoyages.graphql.input.EnquiryInput;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class EnquiryResolver {

    private final EnquiryService enquiryService;

    @QueryMapping
    public List<Enquiry> enquiries() {
        return enquiryService.getAll();
    }

    @MutationMapping
    public Enquiry submitEnquiry(@Argument EnquiryInput input) {
        return enquiryService.save(input);
    }
}