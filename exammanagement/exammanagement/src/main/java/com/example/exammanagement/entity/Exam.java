package com.example.exammanagement.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "exam")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id")
	int examId;
	@Column(name = "name")
	String examName;
	@Column(name = "stream")
	String stream;
	@Column(name = "course")
	String course;
	@Column(name = "date")
	Date date;
	@Column(name = "questions")
	int questions;
	@Column(name = "status")
	String status;

	public Exam() {
		super();
	}

	public Exam(int examId, String examName, String stream, String course, Date date, int questions, String status) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.stream = stream;
		this.course = course;
		this.date = date;
		this.questions = questions;
		this.status = status;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getQuestions() {
		return questions;
	}

	public void setQuestions(int questions) {
		this.questions = questions;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Exam [examId=" + examId + ", examName=" + examName + ", stream=" + stream + ", course=" + course
				+ ", date=" + date + ", questions=" + questions + ", status=" + status + "]";
	}

}
