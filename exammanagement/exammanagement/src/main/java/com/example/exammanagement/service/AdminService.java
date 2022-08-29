package com.example.exammanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.exammanagement.entity.Admin;
@Service
public interface AdminService {
	public List<Admin> getAdmin();

	public void addAdmin(Admin adm);

	public Admin updateAdmin(Admin adm);

	public void deleteAdmin(long id);

}
