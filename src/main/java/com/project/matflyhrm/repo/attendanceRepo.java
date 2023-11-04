package com.project.matflyhrm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.project.matflyhrm.model.attendance;

@Repository
public interface attendanceRepo extends JpaRepository<attendance, Integer> {

	
}
