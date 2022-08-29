package com.example.exammanagement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.exammanagement.entity.Exam;
import com.example.exammanagement.entity.Staff;
import com.example.exammanagement.entity.Student;

import com.example.exammanagement.repo.ExamRepo;
import com.example.exammanagement.repo.StaffRepo;
import com.example.exammanagement.repo.StudentRepo;

@Service
public class StaffserviceImpl implements StaffService {
	@Autowired
	StaffRepo repo;
	@Autowired
	StudentRepo srepo;
	@Autowired
	ExamRepo exrepo;

	@Override
	public List<Staff> getStaff() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void addStaff(Staff ex) {
		// TODO Auto-generated method stub
		List<Student> add = new ArrayList<>();
		for (Student a : ex.getStudent()) {
			Student st = srepo.findById(a.getId()).get();
			add.add(st);
		}
		ex.setStudent(add);

		List<Exam> add2 = new ArrayList<>();
		for (Exam exm : ex.getExam()) {
			Exam e = exrepo.findById(exm.getExamId()).get();
			add2.add(e);
		}
		ex.setExam(add2);
		repo.save(ex);

	}

	@Override
	public Staff updateStaff(Staff ex) {
		// TODO Auto-generated method stub
		return repo.save(ex);
	}

	@Override
	public void deleteStaff(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
