package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class assets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullname;
	private String empid;
	private String assetc;
	private String assetdesc;
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
	public String getAssetc() {
		return assetc;
	}
	public void setAssetc(String assetc) {
		this.assetc = assetc;
	}
	public String getAssetdesc() {
		return assetdesc;
	}
	public void setAssetdesc(String assetdesc) {
		this.assetdesc = assetdesc;
	}
	@Override
	public String toString() {
		return "assets [id=" + id + ", fullname=" + fullname + ", empid=" + empid + ", assetc=" + assetc
				+ ", assetdesc=" + assetdesc + "]";
	}
	
	
	
	
	

}
