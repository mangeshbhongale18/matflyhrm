package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class support {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullname;
	private String empid;
	private String problemtopic;
	private String problemdesc;
	private String wemail;
	private String mobile;
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
	public String getProblemtopic() {
		return problemtopic;
	}
	public void setProblemtopic(String problemtopic) {
		this.problemtopic = problemtopic;
	}
	public String getProblemdesc() {
		return problemdesc;
	}
	public void setProblemdesc(String problemdesc) {
		this.problemdesc = problemdesc;
	}
	public String getWemail() {
		return wemail;
	}
	public void setWemail(String wemail) {
		this.wemail = wemail;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "support [id=" + id + ", fullname=" + fullname + ", empid=" + empid + ", problemtopic=" + problemtopic
				+ ", problemdesc=" + problemdesc + ", wemail=" + wemail + ", mobile=" + mobile + "]";
	}
	
	
	
	
	
}
