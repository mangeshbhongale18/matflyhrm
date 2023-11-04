package com.project.matflyhrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.Notification;
import com.project.matflyhrm.repo.notificationRepo;
import com.project.matflyhrm.service.notificationService;

@Service
public class notificationDao implements notificationService {

	@Autowired
	notificationRepo nr;
	
	@Override
	public void savenotification(Notification n) {
		// TODO Auto-generated method stub
		nr.save(n);
	}

	@Override
	public List<Notification> getNotificationsByEmpId(String empid) {
		// TODO Auto-generated method stub
		return nr.findByEmpid(empid);
	}

	@Override
	public long countNotificationsByEmpId(String empid) {
		// TODO Auto-generated method stub
		return nr.countByEmpid(empid);
	}

	@Override
	public Notification getNotificationById(int id) {
		// TODO Auto-generated method stub
		return nr.getById(id);
	}

	@Override
	public void deleteNotificationById(int id) {
		// TODO Auto-generated method stub
		nr.deleteById(id);
	}

}
