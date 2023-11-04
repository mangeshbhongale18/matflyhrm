package com.project.matflyhrm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.logging.log4j.message.StringFormattedMessage;
@Entity
public class employeetask {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Employee_ID")
	private String empid;
	@Column(name = "Task_Title")
	private String tasktitle;
	@Column(name = "Task_Description")
	private String taskdesc;
	@Column(name = "Project_Name")
	private String projectname;
	@Column(name = "Assigned_By")
	private String assigenedby;
	@Column(name = "Assigned_Date")
	private String assigneddate;
	@Column(name = "Deadline")
	private String deadline;
	
	
	@Column(name = "Task_Status")
	private String taskstatus;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}


	public String getTasktitle() {
		return tasktitle;
	}


	public void setTasktitle(String tasktitle) {
		this.tasktitle = tasktitle;
	}


	public String getTaskdesc() {
		return taskdesc;
	}


	public void setTaskdesc(String taskdesc) {
		this.taskdesc = taskdesc;
	}


	public String getProjectname() {
		return projectname;
	}


	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}


	public String getAssigenedby() {
		return assigenedby;
	}


	public void setAssigenedby(String assigenedby) {
		this.assigenedby = assigenedby;
	}


	public String getAssigneddate() {
		return assigneddate;
	}


	public void setAssigneddate(String assigneddate) {
		this.assigneddate = assigneddate;
	}


	public String getDeadline() {
		return deadline;
	}


	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}


	public String getTaskstatus() {
		return taskstatus;
	}


	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}


	@Override
	public String toString() {
		return "employeetask [id=" + id + ", empid=" + empid + ", tasktitle=" + tasktitle + ", taskdesc=" + taskdesc
				+ ", projectname=" + projectname + ", assigenedby=" + assigenedby + ", assigneddate=" + assigneddate
				+ ", deadline=" + deadline + ", taskstatus=" + taskstatus + "]";
	}

	
	
	
	
}
