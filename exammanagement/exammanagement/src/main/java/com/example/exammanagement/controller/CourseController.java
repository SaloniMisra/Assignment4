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

import com.example.exammanagement.entity.Course;
import com.example.exammanagement.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	CourseService courseservices;

	@GetMapping("/")
	public List<Course> getCourse() {
		return courseservices.getCourse();
	}

	@PostMapping("/")
	public void addCourse(@RequestBody Course course) {
		courseservices.addCourse(course);
	}

	@PutMapping("/")
	public Course updateCourse(@RequestBody Course course) {
		return courseservices.updateCourse(course);
	}

	@DeleteMapping("/")
	public void deleteCourse(long id) {
		courseservices.deleteCourse(id);
	}
}
