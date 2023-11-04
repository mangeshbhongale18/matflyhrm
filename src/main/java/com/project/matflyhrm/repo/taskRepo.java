package com.project.matflyhrm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.employeetask;
@Repository
public interface taskRepo extends JpaRepository<employeetask, Integer> {
	
	List<employeetask> findByEmpid(String empid);
	List<employeetask> findByTaskstatus(String taskstatus);

}
