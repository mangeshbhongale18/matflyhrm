package com.project.matflyhrm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.suggestion;
import com.project.matflyhrm.repo.suggestionRepo;

import com.project.matflyhrm.service.suggestionService;

@Service
public class suggestionDao implements suggestionService {

	
	@Autowired
	suggestionRepo sr;
	
	@Override
	public void savesuggestion(suggestion ss) {
		// TODO Auto-generated method stub
		sr.save(ss);
	}

}
