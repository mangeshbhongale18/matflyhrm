package com.project.matflyhrm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.reimbursement;
import com.project.matflyhrm.repo.reimburrepo;
import com.project.matflyhrm.service.reimbursservice;

@Service
public class reimbursdao implements reimbursservice {
	
	@Autowired
	reimburrepo rp;

	@Override
	public void saveform(reimbursement re) {
		// TODO Auto-generated method stub
		rp.save(re);
	}

}
