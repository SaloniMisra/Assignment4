package com.example.exammanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exammanagement.entity.Student;


public interface StudentRepo extends JpaRepository<Student, Long> {

}
