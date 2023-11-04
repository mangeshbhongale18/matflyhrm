package com.project.matflyhrm.service;

import java.util.List;

import com.project.matflyhrm.model.employeetask;

public interface taskservice {

	void savetask(employeetask emptask);
	List<employeetask> taskforemployee(String empid);
	void deleteCompletedTasks(); 
}
