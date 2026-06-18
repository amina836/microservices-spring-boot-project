package com.amina.school_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer schoolId;
}
