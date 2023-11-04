package com.project.matflyhrm.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class attendance {

	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    private String date;

	    @Column(name = "In_Time")
	    private String intime;

	    @Column(name = "Out_Time")
	    private String outtime;

	    private String status;

	    @Column(name = "Employee_ID")
	    private String empid;

	    @Column(name = "Daily_Total_Hours")
	    private double dailytotalhours;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getIntime() {
			return intime;
		}

		public void setIntime(String intime) {
			this.intime = intime;
		}

		public String getOuttime() {
			return outtime;
		}

		public void setOuttime(String outtime) {
			this.outtime = outtime;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEmpid() {
			return empid;
		}

		public void setEmpid(String empid) {
			this.empid = empid;
		}

		public double getDailytotalhours() {
			return dailytotalhours;
		}

		public void setDailytotalhours(double dailytotalhours) {
			this.dailytotalhours = dailytotalhours;
		}

		@Override
		public String toString() {
			return "attendance [id=" + id + ", date=" + date + ", intime=" + intime + ", outtime=" + outtime
					+ ", status=" + status + ", empid=" + empid + ", dailytotalhours=" + dailytotalhours + "]";
		}

		
	    
	

	
	
	
	
	
}