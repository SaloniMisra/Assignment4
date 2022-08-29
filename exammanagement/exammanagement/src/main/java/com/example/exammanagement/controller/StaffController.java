package com.example.exammanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exammanagement.entity.Staff;

import com.example.exammanagement.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService staffservices;

	@GetMapping("/")
	public List<Staff> getStaff() {
		return staffservices.getStaff();
	}

	@PostMapping("/")
	public void addStaff(@RequestBody Staff staff) {
		staffservices.addStaff(staff);
	}

	@PutMapping("/")
	public Staff updateStaff(@RequestBody Staff staff) {
		return staffservices.updateStaff(staff);
	}

	@DeleteMapping("/")
	public void deleteStaff(long id) {
		staffservices.deleteStaff(id);
	}

}
