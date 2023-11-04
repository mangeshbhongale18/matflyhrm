package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.suggestion;

@Repository
public interface suggestionRepo extends JpaRepository<suggestion, Integer> {

}
