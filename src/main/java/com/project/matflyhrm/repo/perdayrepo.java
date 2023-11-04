package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.matflyhrm.model.perday;

public interface perdayrepo extends JpaRepository<perday, Integer> {

	perday findByEmpid(String empid);
}
