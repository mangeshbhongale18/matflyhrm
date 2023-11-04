package com.project.matflyhrm.model;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.apache.logging.log4j.util.StringBuilderFormattable;

@Entity
public class clients {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String clientcount;
	private String conboardmonth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClientcount() {
		return clientcount;
	}
	public void setClientcount(String clientcount) {
		this.clientcount = clientcount;
	}
	public String getConboardmonth() {
		return conboardmonth;
	}
	public void setConboardmonth(String conboardmonth) {
		this.conboardmonth = conboardmonth;
	}
	@Override
	public String toString() {
		return "clients [id=" + id + ", clientcount=" + clientcount + ", conboardmonth=" + conboardmonth + "]";
	}
	
	
}
