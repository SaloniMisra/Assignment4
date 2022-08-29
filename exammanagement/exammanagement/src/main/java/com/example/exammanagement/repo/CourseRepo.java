package com.example.exammanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exammanagement.entity.Course;



public interface CourseRepo extends JpaRepository<Course, Long> {

}
