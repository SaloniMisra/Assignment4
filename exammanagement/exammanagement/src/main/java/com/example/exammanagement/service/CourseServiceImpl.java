package com.example.exammanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exammanagement.entity.Course;
import com.example.exammanagement.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseRepo repo;
	

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addCourse(Course crs) {
		// TODO Auto-generated method stub
		repo.save(crs);
	}

	@Override
	public Course updateCourse(Course crs) {
		// TODO Auto-generated method stub
		return repo.save(crs);
	}

	@Override
	public void deleteCourse(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
