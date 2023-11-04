package com.project.matflyhrm.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.monthlyattendance;
import com.project.matflyhrm.repo.monthlyattendanceRepo;
import com.project.matflyhrm.service.monthlyattendanceService;

@Service
public class monthlyattendanceDao implements monthlyattendanceService {
	
	@Autowired
	monthlyattendanceRepo mr;

	@Override
	public void savedaycount(monthlyattendance ma) {
		// TODO Auto-generated method stub
		mr.save(ma);
	}

	


	

}
