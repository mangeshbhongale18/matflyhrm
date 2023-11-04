package com.project.matflyhrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.hrmmodel;
import com.project.matflyhrm.repo.HRMRepo;
import com.project.matflyhrm.service.HRMService;
@Service
public class HRMDao implements HRMService {
	@Autowired
	HRMRepo hr;

	@Override
	public void registeremployee(hrmmodel hrm) {
		// TODO Auto-generated method stub
		hr.save(hrm);
	}

	@Override
	public hrmmodel logincheck(String workEmail, String password) {
		// TODO Auto-generated method stub
		hrmmodel hh=hr.findByWorkEmail(workEmail);
		if (hh==null || !hh.getPassword().equals(password) ) {
			throw new IllegalArgumentException("Invalid Credential");
			
		}
		return hh;
	}

	@Override
	public hrmmodel getdata(String workEmail) {
		// TODO Auto-generated method stub
		return hr.findByWorkEmail(workEmail);
	}

	@Override
	public List<hrmmodel> allemployee(String employeeID) {
		// TODO Auto-generated method stub
		return hr.findByEmployeeID(employeeID);
	}

	@Override
	public long totalemployee() {
		// TODO Auto-generated method stub
		return hr.count();
	}

	@Override
	public List<hrmmodel> allemployee(hrmmodel hrm) {
		// TODO Auto-generated method stub
		return hr.findAll();
	}

	@Override
	public List<hrmmodel> editemp(String employeeID) {
		// TODO Auto-generated method stub
		return hr.findByEmployeeID(employeeID);
	}

	

}
