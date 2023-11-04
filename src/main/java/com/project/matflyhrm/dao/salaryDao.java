package com.project.matflyhrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.perday;
import com.project.matflyhrm.model.salary;
import com.project.matflyhrm.repo.perdayrepo;
import com.project.matflyhrm.repo.salaryrepo;
import com.project.matflyhrm.service.salaryservice;
@Service
public class salaryDao implements salaryservice {

	@Autowired
	salaryrepo sr;
	
	@Autowired
	perdayrepo pr;

	@Override
	public salary generatesalary(String empid, String month, String year) {
		// TODO Auto-generated method stub
		return sr.findByEmpidAndMonthAndYear(empid, month, year);
	}

	@Override
	public perday getperday(String empid) {
		// TODO Auto-generated method stub
		return pr.findByEmpid(empid);
	}

	
}
