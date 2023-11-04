package com.project.matflyhrm.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.clientinfo;
import com.project.matflyhrm.repo.clientinfoRepo;
import com.project.matflyhrm.service.clientinfoService;

@Service
public class clientinfoDao implements clientinfoService {

	@Autowired
	clientinfoRepo cir;
	
	@Override
	public void saveclientinfo(clientinfo ci) {
		// TODO Auto-generated method stub
		cir.save(ci);
	}

	@Override
	public long totalactiveclinet(String clientstatus) {
		// TODO Auto-generated method stub
		return cir.countByClientstatus(clientstatus);
	}

	@Override
	public long allclinets() {
		// TODO Auto-generated method stub
		return cir.count();
	}

}
