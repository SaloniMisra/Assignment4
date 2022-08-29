package com.example.exammanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exammanagement.entity.Exam;


public interface ExamRepo extends JpaRepository<Exam, Integer>{

}
