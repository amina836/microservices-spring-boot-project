package com.amina.school_service.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amina.school_service.client.StudentClient;
import com.amina.school_service.dto.FullSchoolResponse;
import com.amina.school_service.entity.School;
import com.amina.school_service.repository.SchoolRepository;
import com.amina.school_service.service.SchoolService;
import org.springframework.web.bind.annotation.PathVariable;

import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/api/v1/schools")
// @RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;
        public SchoolController(
            SchoolService service) {
        this.service = service;
      
    }

    @PostMapping
    public void createSchool(@RequestBody School school) {
        service.saveSchool(school);
    }

    @GetMapping
    public List<School> getAll() {
        return service.getAllSchools();
    }
    @GetMapping("/{id}")
public School getSchoolById(@PathVariable Integer id) {
    return service.getSchoolById(id);
}

@GetMapping("/with-students/{id}")
public FullSchoolResponse getSchoolWithStudents(@PathVariable Integer id) {
    System.out.println("HIT CONTROLLER");
    return service.getSchoolWithStudents(id);
}
}