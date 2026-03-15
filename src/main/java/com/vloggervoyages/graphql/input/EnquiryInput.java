package com.vloggervoyages.graphql.input;

import lombok.Data;

@Data
public class EnquiryInput {

    private Long tourId;
    private String name;
    private String email;
    private String phone;
    private String message;
    private String source;
}