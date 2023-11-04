package com.project.matflyhrm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.leaves;
@Repository
public interface leavesRepo extends JpaRepository<leaves, Integer> {
	
	List<leaves>findByEmpid(String empid);
	List<leaves>findByEmpidAndSdate(String empid, String sdate);
//	leaves findByEmpid(String empid);

}
