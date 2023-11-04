package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.support;

@Repository
public interface supportRepo extends JpaRepository<support, Integer> {

}
