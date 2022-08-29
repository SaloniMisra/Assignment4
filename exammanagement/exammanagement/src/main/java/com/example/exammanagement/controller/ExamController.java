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

import com.example.exammanagement.entity.Exam;
import com.example.exammanagement.service.ExamService;

@RestController
@RequestMapping("/exam")
public class ExamController {
	@Autowired
	ExamService examservices;

	@GetMapping("/")
	public List<Exam> getExam() {
		return examservices.getExam();
	}

	@PostMapping("/")
	public void addCourse(@RequestBody Exam exam) {
		examservices.addExam(exam);
	}

	@PutMapping("/")
	public Exam updateExam(@RequestBody Exam exam) {
		return examservices.updateExam(exam);
	}

	@DeleteMapping("/")
	public void deleteExam(int id) {
		examservices.deleteExam(id);
	}
}
