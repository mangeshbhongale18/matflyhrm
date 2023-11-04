package com.project.matflyhrm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.assets;
import com.project.matflyhrm.repo.assetsRepo;
import com.project.matflyhrm.service.assetsService;

@Service
public class assetsDao implements assetsService {

	@Autowired
	assetsRepo ar;
	
	@Override
	public void saveassetreq(assets a) {
		// TODO Auto-generated method stub
		ar.save(a);
	}

	
}
