package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class permission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String empid;
	private String permissionstatus;
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
	public String getPermissionstatus() {
		return permissionstatus;
	}
	public void setPermissionstatus(String permissionstatus) {
		this.permissionstatus = permissionstatus;
	}
	@Override
	public String toString() {
		return "permission [id=" + id + ", empid=" + empid + ", permissionstatus=" + permissionstatus + "]";
	}
	
	
	

}
