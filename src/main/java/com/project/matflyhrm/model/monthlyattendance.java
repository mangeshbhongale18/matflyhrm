package com.project.matflyhrm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class monthlyattendance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String month;
	private String year;
	@Column(name = "Total_Month_Day")
	private double totalmonthday;
	@Column(name = "Total_Present_days")
	private double totalpresentdays;
	@Column(name = "Total_Absent_days")
	private double totalabsentday;
	@Column(name = "Total_Half_days")
	private double halfdays;
	@Column(name = "Employee_ID")
	private String empid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getTotalmonthday() {
		return totalmonthday;
	}
	public void setTotalmonthday(double totalmonthday) {
		this.totalmonthday = totalmonthday;
	}
	public double getTotalpresentdays() {
		return totalpresentdays;
	}
	public void setTotalpresentdays(double totalpresentdays) {
		this.totalpresentdays = totalpresentdays;
	}
	public double getTotalabsentday() {
		return totalabsentday;
	}
	public void setTotalabsentday(double totalabsentday) {
		this.totalabsentday = totalabsentday;
	}
	public double getHalfdays() {
		return halfdays;
	}
	public void setHalfdays(double halfdays) {
		this.halfdays = halfdays;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "monthlyattendance [id=" + id + ", month=" + month + ", year=" + year + ", totalmonthday="
				+ totalmonthday + ", totalpresentdays=" + totalpresentdays + ", totalabsentday=" + totalabsentday
				+ ", halfdays=" + halfdays + ", empid=" + empid + "]";
	}
	
	
}
