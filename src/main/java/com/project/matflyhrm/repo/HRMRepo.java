package com.project.matflyhrm.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.hrmmodel;

@Repository
public interface HRMRepo extends JpaRepository<hrmmodel, Integer> {

	 hrmmodel findByWorkEmail(String workEmail);
	 long count();
	 List<hrmmodel> findByEmployeeID(String employeeID);
}
