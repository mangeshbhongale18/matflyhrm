package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.clients;

@Repository
public interface clientRepo extends JpaRepository<clients, Integer> {
	

}
