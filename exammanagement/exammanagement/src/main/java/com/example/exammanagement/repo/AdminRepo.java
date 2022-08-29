package com.example.exammanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.exammanagement.entity.Admin;



public interface AdminRepo extends JpaRepository<Admin, Long>{

}
