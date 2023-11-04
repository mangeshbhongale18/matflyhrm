package com.project.matflyhrm.service;

import java.util.List;

import com.project.matflyhrm.model.Notification;



public interface notificationService {

	void savenotification(Notification n);

	List<Notification> getNotificationsByEmpId(String empid);
	public long countNotificationsByEmpId(String empid);
	public Notification getNotificationById(int id);
	void deleteNotificationById(int id);
}
