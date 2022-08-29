package com.example.exammanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.exammanagement.entity.Staff;


@Service
public interface StaffService {
	public List<Staff> getStaff();

	public void addStaff(Staff staff);

	public Staff updateStaff(Staff staff);

	public void deleteStaff(long id);
}
