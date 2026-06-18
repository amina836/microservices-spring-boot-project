package com.amina.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.amina.entity.Student;
import com.amina.repository.StudentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public List<Student> getStudentsBySchoolId(Integer schoolId) {
        return repository.findAllBySchoolId(schoolId);
    }
}