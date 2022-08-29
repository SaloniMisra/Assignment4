package com.example.exammanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.exammanagement.entity.Course;


@Service
public interface CourseService {
	public List<Course> getCourse();

	public void addCourse(Course course);

	public Course updateCourse(Course course);

	public void deleteCourse(long id);
}
