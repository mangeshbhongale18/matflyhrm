package com.project.matflyhrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.leaves;
import com.project.matflyhrm.repo.leavesRepo;
import com.project.matflyhrm.service.leavesService;

@Service
public class leavesDao implements leavesService {

	@Autowired
	leavesRepo lr;
	;
	
	@Override
	public void sendleaverequest(leaves l) {
		// TODO Auto-generated method stub
		lr.save(l);
	}

	@Override
	public List<leaves> leavesbyempid(String empid) {
		// TODO Auto-generated method stub
		return lr.findByEmpid(empid);
	}

	@Override
	public List<leaves> allleaves() {
		// TODO Auto-generated method stub
		return lr.findAll();
	}

	@Override
	public void updateLeaveStatus(String empid,String sdate, String lstatus) {
		
		  List<leaves> leavesList = lr.findByEmpidAndSdate(empid,sdate);

		    for (leaves leave : leavesList) {
		        if (leave != null) {
		            leave.setLstatus(lstatus);
		            lr.save(leave);
		        }
		    }
		
	}

	
	

	
  
	
}
