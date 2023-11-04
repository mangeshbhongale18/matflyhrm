package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class reimbursement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
    private String fullname;       
    private String empid;          
    private String department;     
    private String designation;    
    private String amount;         
    private String mobile;         
    private String edate;         
    private String ecategory;       
    private String sdate;
    private String filename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getEcategory() {
		return ecategory;
	}
	public void setEcategory(String ecategory) {
		this.ecategory = ecategory;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public String toString() {
		return "reimbursement [id=" + id + ", fullname=" + fullname + ", empid=" + empid + ", department=" + department
				+ ", designation=" + designation + ", amount=" + amount + ", mobile=" + mobile + ", edate=" + edate
				+ ", ecategory=" + ecategory + ", sdate=" + sdate + ", filename=" + filename + "]";
	}
	
    
}
