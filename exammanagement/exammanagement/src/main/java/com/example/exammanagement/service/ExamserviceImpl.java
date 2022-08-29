package com.example.exammanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exammanagement.entity.Exam;
import com.example.exammanagement.repo.ExamRepo;

@Service
public class ExamserviceImpl implements ExamService {
	@Autowired
ExamRepo exrepo;
	@Override
	public List<Exam> getExam() {
		// TODO Auto-generated method stub
		return exrepo.findAll();
	}

	@Override
	public void addExam(Exam exam) {
		// TODO Auto-generated method stub
		exrepo.save(exam);
	}

	@Override
	public Exam updateExam(Exam exam) {
		// TODO Auto-generated method stub
		return exrepo.save(exam);
	}

	@Override
	public void deleteExam(int id) {
		// TODO Auto-generated method stub
		exrepo.deleteById(id);
	}
}
