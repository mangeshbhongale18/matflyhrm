package com.project.matflyhrm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.Notification;

@Repository
public interface notificationRepo extends JpaRepository<Notification, Integer> {
	
	List<Notification>findByEmpid(String empid);
	long countByEmpid(String empid);

}
