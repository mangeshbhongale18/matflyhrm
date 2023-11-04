package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class clientinfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String clientname;
	private String clientindustry;
	private String clientstatus;
	private String clientsinfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientname() {
		return clientname;
	}
	public void setClientname(String clientname) {
		this.clientname = clientname;
	}
	public String getClientindustry() {
		return clientindustry;
	}
	public void setClientindustry(String clientindustry) {
		this.clientindustry = clientindustry;
	}
	public String getClientstatus() {
		return clientstatus;
	}
	public void setClientstatus(String clientstatus) {
		this.clientstatus = clientstatus;
	}
	public String getClientsinfo() {
		return clientsinfo;
	}
	public void setClientsinfo(String clientsinfo) {
		this.clientsinfo = clientsinfo;
	}
	@Override
	public String toString() {
		return "clientinfo [id=" + id + ", clientname=" + clientname + ", clientindustry=" + clientindustry
				+ ", clientstatus=" + clientstatus + ", clientsinfo=" + clientsinfo + "]";
	}
	
	
	
}
