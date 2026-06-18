package com.amina.school_service.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amina.school_service.dto.Student;

@FeignClient(
        name = "student-service",
        url = "http://localhost:8091"
)
public interface StudentClient {
@GetMapping("/api/v1/students/school/{schoolId}")
List<Student> getStudentsBySchool(
        @PathVariable Integer schoolId
);
}