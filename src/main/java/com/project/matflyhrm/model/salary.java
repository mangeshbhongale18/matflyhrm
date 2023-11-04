package com.project.matflyhrm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class salary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "Employee_ID")
	private String empid;
	@Column(name = "Month")
	private String month;
	@Column(name = "Year")
	private String year;
	@Column(name = "Total_Present_days")
	private double totalpresentdays;
	@Column(name = "Total_Absent_days")
	private double totalabsentdays;
	@Column(name = "Total_Half_days")
	private double totalhalfdays;
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
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public double getTotalpresentdays() {
		return totalpresentdays;
	}
	public void setTotalpresentdays(double totalpresentdays) {
		this.totalpresentdays = totalpresentdays;
	}
	public double getTotalabsentdays() {
		return totalabsentdays;
	}
	public void setTotalabsentdays(double totalabsentdays) {
		this.totalabsentdays = totalabsentdays;
	}
	public double getTotalhalfdays() {
		return totalhalfdays;
	}
	public void setTotalhalfdays(double totalhalfdays) {
		this.totalhalfdays = totalhalfdays;
	}
	@Override
	public String toString() {
		return "salary [id=" + id + ", empid=" + empid + ", month=" + month + ", year=" + year + ", totalpresentdays="
				+ totalpresentdays + ", totalabsentdays=" + totalabsentdays + ", totalhalfdays=" + totalhalfdays
				+ ", getId()=" + getId() + ", getEmpid()=" + getEmpid() + ", getMonth()=" + getMonth() + ", getYear()="
				+ getYear() + ", getTotalpresentdays()=" + getTotalpresentdays() + ", getTotalabsentdays()="
				+ getTotalabsentdays() + ", getTotalhalfdays()=" + getTotalhalfdays() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
