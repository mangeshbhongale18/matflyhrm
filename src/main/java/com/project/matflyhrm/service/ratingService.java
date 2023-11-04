package com.project.matflyhrm.service;

import java.util.List;

import com.project.matflyhrm.model.rating;

public interface ratingService {

	boolean saverating(rating r);
	List<rating>getratingbymonth(String month);
}
