package com.project.matflyhrm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.support;
import com.project.matflyhrm.repo.supportRepo;
import com.project.matflyhrm.service.supportService;

@Service
public class supportDao implements supportService{
	
	@Autowired
	supportRepo sr;

	@Override
	public void savesupportrequest(support s) {
		// TODO Auto-generated method stub
		sr.save(s);
	}

}
