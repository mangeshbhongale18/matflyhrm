package com.project.matflyhrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.clients;
import com.project.matflyhrm.repo.clientRepo;
import com.project.matflyhrm.service.clientService;

@Service
public class clientDao implements clientService {

	@Autowired
	clientRepo cr;
	@Override
	public List<clients> clientlist() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}
	

}
