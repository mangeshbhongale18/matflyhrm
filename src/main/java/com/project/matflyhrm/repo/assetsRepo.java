package com.project.matflyhrm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.matflyhrm.model.assets;

@Repository
public interface assetsRepo extends JpaRepository<assets, Integer> {

}
