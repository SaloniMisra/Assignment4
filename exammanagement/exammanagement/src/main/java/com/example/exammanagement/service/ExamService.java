package com.example.exammanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.exammanagement.entity.Exam;
@Service
public interface ExamService {
	public List<Exam> getExam();

	public void addExam(Exam exam);

	public Exam updateExam(Exam exam);

	public void deleteExam(int id);
}
