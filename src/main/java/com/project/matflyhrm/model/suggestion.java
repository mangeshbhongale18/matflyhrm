package com.project.matflyhrm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class suggestion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String fullname;
	private String empid;
	private String suggestiontitile;
	private String suggestiondesc;
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
	public String getSuggestiontitile() {
		return suggestiontitile;
	}
	public void setSuggestiontitile(String suggestiontitile) {
		this.suggestiontitile = suggestiontitile;
	}
	public String getSuggestiondesc() {
		return suggestiondesc;
	}
	public void setSuggestiondesc(String suggestiondesc) {
		this.suggestiondesc = suggestiondesc;
	}
	@Override
	public String toString() {
		return "suggestion [id=" + id + ", fullname=" + fullname + ", empid=" + empid + ", suggestiontitile="
				+ suggestiontitile + ", suggestiondesc=" + suggestiondesc + "]";
	}
	
	
	
	
	
}
