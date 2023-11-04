package com.project.matflyhrm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.permission;

@Repository
public interface permissionRepo extends JpaRepository<permission, Integer> {
	
	permission findByEmpid(String empid);

}
