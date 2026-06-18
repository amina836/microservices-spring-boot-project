package com.amina.school_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amina.school_service.entity.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {
}