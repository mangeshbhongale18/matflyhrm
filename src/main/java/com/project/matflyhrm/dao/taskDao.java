package com.project.matflyhrm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.project.matflyhrm.model.employeetask;
import com.project.matflyhrm.repo.taskRepo;
import com.project.matflyhrm.service.taskservice;
@Service
public class taskDao implements taskservice{

	@Autowired
	taskRepo tr;
	
	@Override
	public List<employeetask> taskforemployee(String empid) {
		return tr.findByEmpid(empid);
	}

	@Override
	public void savetask(employeetask emptask) {
		// TODO Auto-generated method stub
		tr.save(emptask);
	}
	
	
	@Override
	@Scheduled(cron = "0 0 0 ? * SUN")
	public void deleteCompletedTasks() {
	    List<employeetask> tasksToDelete = tr.findByTaskstatus("completed");
	    tr.deleteAll(tasksToDelete);
	}



	

}
