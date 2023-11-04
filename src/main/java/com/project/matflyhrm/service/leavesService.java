package com.project.matflyhrm.service;

import java.util.List;

import com.project.matflyhrm.model.leaves;

public interface leavesService {

	void sendleaverequest(leaves l);
	List<leaves>leavesbyempid(String empid);
	List<leaves>allleaves();
	void updateLeaveStatus(String empid, String sdate, String lstatus);
	
}
