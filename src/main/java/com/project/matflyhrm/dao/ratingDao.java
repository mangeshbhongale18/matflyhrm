package com.project.matflyhrm.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.rating;
import com.project.matflyhrm.repo.ratingRepo;
import com.project.matflyhrm.service.ratingService;

@Service
public class ratingDao implements ratingService{
	
	@Autowired
	ratingRepo rr;

	@Override
	public boolean saverating(rating r) {
	    Optional<rating> existingRating = rr.findByMonthAndYearAndEmpid(r.getMonth(), r.getYear(), r.getEmpid());

	    if (existingRating.isPresent()) {
	        return false; // A rating for this month and year already exists for the specified employee
	    } else {
	        rr.save(r); // Save the new rating
	        return true; // Successfully saved the rating
	    }
	}

	@Override
	public List<rating> getratingbymonth(String month) {
		// TODO Auto-generated method stub
		return rr.findByMonth(month);
	}

}
