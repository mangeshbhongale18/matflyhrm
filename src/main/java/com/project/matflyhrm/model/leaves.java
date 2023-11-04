package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class leaves {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullname;
	private String empid;
	private String leavereason;
	private String ldescription;
	private String sdate;
	private String edate;
	private String lstatus="pending";
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
	public String getLeavereason() {
		return leavereason;
	}
	public void setLeavereason(String leavereason) {
		this.leavereason = leavereason;
	}
	public String getLdescription() {
		return ldescription;
	}
	public void setLdescription(String ldescription) {
		this.ldescription = ldescription;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getLstatus() {
		return lstatus;
	}
	public void setLstatus(String lstatus) {
		this.lstatus = lstatus;
	}
	@Override
	public String toString() {
		return "leaves [id=" + id + ", fullname=" + fullname + ", empid=" + empid + ", leavereason=" + leavereason
				+ ", ldescription=" + ldescription + ", sdate=" + sdate + ", edate=" + edate + ", lstatus=" + lstatus
				+ "]";
	}
	
	
	
}
