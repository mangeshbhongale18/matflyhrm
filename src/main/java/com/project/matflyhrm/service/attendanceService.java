package com.project.matflyhrm.service;

import java.util.List;

import com.project.matflyhrm.model.attendance;

public interface attendanceService {
	
	List<attendance>allattendance();
	void saveattendance(attendance atn);

}
