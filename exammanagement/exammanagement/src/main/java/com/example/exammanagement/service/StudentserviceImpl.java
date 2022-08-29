package com.example.exammanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.exammanagement.entity.Course;
import com.example.exammanagement.entity.Exam;

import com.example.exammanagement.entity.Student;
import com.example.exammanagement.repo.AdminRepo;
import com.example.exammanagement.repo.CourseRepo;
import com.example.exammanagement.repo.ExamRepo;
import com.example.exammanagement.repo.StaffRepo;
import com.example.exammanagement.repo.StudentRepo;

@Service
public class StudentserviceImpl implements StudentService {
	@Autowired
	StudentRepo repo;
	@Autowired
	AdminRepo adrepo;
	@Autowired
	StaffRepo strepo;
	@Autowired
	ExamRepo exrepo;
	@Autowired
	CourseRepo crepo;

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		

		List<Exam> add2 = new ArrayList<>();
		for (Exam exm : st.getExam()) {
			Exam e = exrepo.findById(exm.getExamId()).get();
			add2.add(e);
		}
		st.setExam(add2);
		
		List<Course> add3 = new ArrayList<>();
		for (Course co : st.getCourse()) {
			Course c = crepo.findById(co.getId()).get();
			add3.add(c);
		}
		
		repo.save(st);

	}

	@Override
	public Student updateStudent(Student ex) {
		// TODO Auto-generated method stub
		return repo.save(ex);
	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
