package com.amina.school_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.amina.school_service.client.StudentClient;
import com.amina.school_service.dto.FullSchoolResponse;
import com.amina.school_service.dto.Student;
import com.amina.school_service.entity.School;
import com.amina.school_service.repository.SchoolRepository;

import lombok.RequiredArgsConstructor;

@Service
// @RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;
    private final StudentClient studentClient;
       public SchoolService(
            SchoolRepository repository,
            StudentClient studentClient) {
        this.repository = repository;
        this.studentClient = studentClient;
    }

    public void saveSchool(School school) {
        repository.save(school);
    }

    public List<School> getAllSchools() {
        return repository.findAll();
    }
    public School getSchoolById(Integer id) {
    return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("School not found"));
}
public FullSchoolResponse getSchoolWithStudents(Integer schoolId) {

    School school = repository.findById(schoolId)
            .orElseThrow(() -> new RuntimeException("School not found"));

    List<Student> students =
            studentClient.getStudentsBySchool(schoolId);
FullSchoolResponse response = new FullSchoolResponse();

response.setName(school.getName());
response.setEmail(school.getEmail());
response.setStudents(students);

return response;
}
}