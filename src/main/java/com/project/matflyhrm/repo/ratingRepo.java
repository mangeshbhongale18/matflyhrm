package com.project.matflyhrm.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.matflyhrm.model.rating;

public interface ratingRepo extends JpaRepository<rating, Integer> {
	Optional<rating>findByMonthAndYearAndEmpid(String month,String year,String empid);
	List<rating>findByMonth(String month);

}
