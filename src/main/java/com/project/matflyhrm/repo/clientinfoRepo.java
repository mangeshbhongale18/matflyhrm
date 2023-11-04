package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.clientinfo;

@Repository
public interface clientinfoRepo extends JpaRepository<clientinfo, Integer> {
	long countByClientstatus(String clientstatus);

}
