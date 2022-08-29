package com.example.exammanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exammanagement.entity.Staff;



public interface StaffRepo extends JpaRepository<Staff, Long> {

}
