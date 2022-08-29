package com.example.exammanagement.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "staff")
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")

	long id;
	@Column(name = "staffname")
	String staffname;
	@Column(name = "password")
	String password;
	@Column(name = "contact")
	String contact_no;
	@OneToMany
	List<Exam> exam;
	@OneToMany
	List<Student> student;

	public Staff() {
		super();
	}

	public Staff(long id, String staffname, String password, String contact_no, List<Exam> exam,
			List<Student> student) {
		super();
		this.id = id;
		this.staffname = staffname;
		this.password = password;
		this.contact_no = contact_no;
		this.exam = exam;
		this.student = student;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStaffname() {
		return staffname;
	}

	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact_no() {
		return contact_no;
	}

	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

	public List<Exam> getExam() {
		return exam;
	}

	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", staffname=" + staffname + ", password=" + password + ", contact_no=" + contact_no
				+ ", exam=" + exam + ", student=" + student + "]";
	}

}
