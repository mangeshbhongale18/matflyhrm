package com.project.matflyhrm.service;



import java.util.List;

import com.project.matflyhrm.model.hrmmodel;

public interface HRMService {
	void registeremployee(hrmmodel hrm);
	hrmmodel logincheck(String workEmail, String password);
	hrmmodel getdata(String workEmail);
	List<hrmmodel>allemployee(String employeeID);
	List<hrmmodel>allemployee(hrmmodel hrm);
	
	long totalemployee();
	
	List<hrmmodel> editemp(String employeeID);
	

}
