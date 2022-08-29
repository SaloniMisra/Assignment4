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

import com.example.exammanagement.entity.Admin;
import com.example.exammanagement.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminservices;

	@GetMapping("/")
	public List<Admin> getAdmin() {
		return adminservices.getAdmin();
	}

	@PostMapping("/")
	public void addAdmin(@RequestBody Admin adm) {
		adminservices.addAdmin(adm);
	}

	@PutMapping("/")
	public Admin updateAdmin(@RequestBody Admin adm) {
		return adminservices.updateAdmin(adm);
	}

	@DeleteMapping("/")
	public void deleteAdmin(long id) {
		adminservices.deleteAdmin(id);
	}
}
