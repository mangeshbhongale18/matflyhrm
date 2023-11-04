package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class perday {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empid;
	private String employeename;
	private double perday;
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
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public double getPerday() {
		return perday;
	}
	public void setPerday(double perday) {
		this.perday = perday;
	}
	@Override
	public String toString() {
		return "perday [id=" + id + ", empid=" + empid + ", employeename=" + employeename + ", perday=" + perday + "]";
	}
	
	
	
	
		
}
