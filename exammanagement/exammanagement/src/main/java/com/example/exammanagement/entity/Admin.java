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
@Table(name = "admin")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	long id;
	@Column(name = "address")
	String address;
	@Column(name = "name")
	String name;
	@Column(name = "password")
	String Password;
	@OneToMany
	List<Staff> staff;
	@OneToMany
	List<Exam> exam;
	@OneToMany
	List<Student> student;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public List<Staff> getStaff() {
		return staff;
	}

	public void setStaff(List<Staff> staff) {
		this.staff = staff;
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

	public Admin(long id, String address, String name, String password, List<Staff> staff, List<Exam> exam,
			List<Student> student) {
		super();
		this.id = id;
		this.address = address;
		this.name = name;
		Password = password;
		this.staff = staff;
		this.exam = exam;
		this.student = student;
	}

	public Admin() {
		super();
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", address=" + address + ", name=" + name + ", Password=" + Password + ", staff="
				+ staff + ", exam=" + exam + ", student=" + student + "]";
	}

}
