package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String month;
	private String year;
	private int rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "rating [id=" + id + ", month=" + month + ", year=" + year + ", rating=" + rating + ", empid=" + empid
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
