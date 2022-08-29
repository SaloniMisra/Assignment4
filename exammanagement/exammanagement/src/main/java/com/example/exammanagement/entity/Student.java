package com.example.exammanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")

	long id;
	@Column(name = "studentname")
	String studentname;
	@Column(name = "spassword")
	String spassword;
	@Column(name = "contact_no")
	String contact_no;
	@Column(name = "roll_no")
	String roll_no;
	@Column(name = "address")
	String address;
	@ManyToMany
	List<Course> course;
	@ManyToMany
	List<Exam> exam;

	public Student() {
		super();
	}

	public Student(long id, String studentname, String spassword, String contact_no, String roll_no, String address,
			List<Course> course, List<Exam> exam) {
		super();
		this.id = id;
		this.studentname = studentname;
		this.spassword = spassword;
		this.contact_no = contact_no;
		this.roll_no = roll_no;
		this.address = address;
		this.course = course;
		this.exam = exam;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentname=" + studentname + ", spassword=" + spassword + ", contact_no="
				+ contact_no + ", roll_no=" + roll_no + ", address=" + address + ", course=" + course + ", exam=" + exam
				+ "]";
	}
	

}
