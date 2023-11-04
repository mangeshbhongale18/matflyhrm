package com.project.matflyhrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.calendar;
import com.project.matflyhrm.repo.CalendarRepo;
import com.project.matflyhrm.service.CalendarService;


@Service
public class CalendarDao implements CalendarService{

	@Autowired
	CalendarRepo cr;

	

	@Override
	public List<calendar> holidays() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
	
	
}
