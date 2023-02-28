package com.gustavo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavo.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
