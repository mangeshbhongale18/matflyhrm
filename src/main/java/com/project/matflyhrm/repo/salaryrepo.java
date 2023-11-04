package com.project.matflyhrm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.salary;
@Repository
public interface salaryrepo extends JpaRepository<salary, Integer>{
	
	salary findByEmpidAndMonthAndYear(String empid,String month,String year);

}
