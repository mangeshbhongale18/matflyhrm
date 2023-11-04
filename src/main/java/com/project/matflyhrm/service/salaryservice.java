package com.project.matflyhrm.service;

import java.util.List;

import com.project.matflyhrm.model.perday;
import com.project.matflyhrm.model.salary;

public interface salaryservice {

	salary generatesalary(String empid,String month,String year);
	perday getperday(String empid);
}
