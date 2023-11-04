package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.reimbursement;

@Repository
public interface reimburrepo extends JpaRepository<reimbursement, Integer>{

}
