package com.example.exammanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exammanagement.entity.Student;
import com.example.exammanagement.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	StudentService studentservices;

	@GetMapping("/")
	public List<Student> getStudent() {
		return studentservices.getStudent();
	}

	@PostMapping("/")
	public void addStudent(@RequestBody Student student) {
		studentservices.addStudent(student);
	}

	@PutMapping("/")
	public Student updateStudent(@RequestBody Student student) {
		return studentservices.updateStudent(student);
	}

	@DeleteMapping("/")
	public void deleteStudent(long id) {
		studentservices.deleteStudent(id);
	}
}
