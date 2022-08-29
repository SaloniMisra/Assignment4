package com.example.exammanagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")

	long id;
	@Column(name = "name")
	String name;
	@Column(name = "subject")
	String subject;
	@Column(name = "stream")
	String stream;

	public Course() {
		super();
	}

	public Course(long id, String name, String subject, String stream) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.stream = stream;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStream() {
		return stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", subject=" + subject + ", stream=" + stream + "]";
	}

}
