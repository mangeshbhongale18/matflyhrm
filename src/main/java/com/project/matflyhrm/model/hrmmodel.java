package com.project.matflyhrm.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class hrmmodel {

	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int id;

	    // Personal Details
	    private String firstName;
	    private String middleName;
	    private String lastName;
	    private String dob;
	    private String gender;

	    // Contact Details
	    private String personalEmail;
	    private String personalPhone;

	    // Address
	    private String currentAddress;
	    private String permanentAddress;
	    private String currentCity;
	    private String permanentCity;
	    private String currentState;
	    private String permanentState;
	    private String currentCountry;
	    private String permanentCountry;
	    private String currentPostal;
	    private String permanentPostal;

	    // Work Experience Details
	    private String companyName;
	    private String jobTitle;
	    private String priveouDepartment;
	    private String lastjoinDate;
	    private String workExperience;


	    // Job Details
	    private String joinDate;
	    private String department;
	    private String designation;
	    private String workEmail;
	    private String workPhone;
	    private String location;

	    // Personal Document
	    private String adharcard;
	    private String panCard;
	    private String passport;
	    
	    private String adharcardfilename;
	    private String pancardfilename;
	    private String passportcardfilename;

	    // Educational Details
	    private String ssc;
	    private String hsc;
	    private String sscState;
	    private String hscState;
	    private String sscdocname;
	    private String hscdocname;
	    private String ugname;
	    private String pgname;
	    private String stateug;
	    private String statepg;
	    private String ugdocfilename;
	    private String pgdocfilename;

	    // Emergency Contact Details
	    private String emergencyno;
	    private String relation;
	    
	    //Bank Details
	    private String bankname;
	    private String bankacno;
	    private String bankifsc;
	    private String bankpass;

	    // Resume/CV & Profile Picture
	    private String resumefilename;
	    private String profilepicfilename;

	    // Security
	    private String password;
	    private String cpassword;

	    // Employee ID
	    private String employeeID="001";
	    private String empstatus="Pending";
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getMiddleName() {
			return middleName;
		}
		public void setMiddleName(String middleName) {
			this.middleName = middleName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getPersonalEmail() {
			return personalEmail;
		}
		public void setPersonalEmail(String personalEmail) {
			this.personalEmail = personalEmail;
		}
		public String getPersonalPhone() {
			return personalPhone;
		}
		public void setPersonalPhone(String personalPhone) {
			this.personalPhone = personalPhone;
		}
		public String getCurrentAddress() {
			return currentAddress;
		}
		public void setCurrentAddress(String currentAddress) {
			this.currentAddress = currentAddress;
		}
		public String getPermanentAddress() {
			return permanentAddress;
		}
		public void setPermanentAddress(String permanentAddress) {
			this.permanentAddress = permanentAddress;
		}
		public String getCurrentCity() {
			return currentCity;
		}
		public void setCurrentCity(String currentCity) {
			this.currentCity = currentCity;
		}
		public String getPermanentCity() {
			return permanentCity;
		}
		public void setPermanentCity(String permanentCity) {
			this.permanentCity = permanentCity;
		}
		public String getCurrentState() {
			return currentState;
		}
		public void setCurrentState(String currentState) {
			this.currentState = currentState;
		}
		public String getPermanentState() {
			return permanentState;
		}
		public void setPermanentState(String permanentState) {
			this.permanentState = permanentState;
		}
		public String getCurrentCountry() {
			return currentCountry;
		}
		public void setCurrentCountry(String currentCountry) {
			this.currentCountry = currentCountry;
		}
		public String getPermanentCountry() {
			return permanentCountry;
		}
		public void setPermanentCountry(String permanentCountry) {
			this.permanentCountry = permanentCountry;
		}
		public String getCurrentPostal() {
			return currentPostal;
		}
		public void setCurrentPostal(String currentPostal) {
			this.currentPostal = currentPostal;
		}
		public String getPermanentPostal() {
			return permanentPostal;
		}
		public void setPermanentPostal(String permanentPostal) {
			this.permanentPostal = permanentPostal;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		public String getPriveouDepartment() {
			return priveouDepartment;
		}
		public void setPriveouDepartment(String priveouDepartment) {
			this.priveouDepartment = priveouDepartment;
		}
		public String getLastjoinDate() {
			return lastjoinDate;
		}
		public void setLastjoinDate(String lastjoinDate) {
			this.lastjoinDate = lastjoinDate;
		}
		public String getWorkExperience() {
			return workExperience;
		}
		public void setWorkExperience(String workExperience) {
			this.workExperience = workExperience;
		}
		public String getJoinDate() {
			return joinDate;
		}
		public void setJoinDate(String joinDate) {
			this.joinDate = joinDate;
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
		public String getWorkEmail() {
			return workEmail;
		}
		public void setWorkEmail(String workEmail) {
			this.workEmail = workEmail;
		}
		public String getWorkPhone() {
			return workPhone;
		}
		public void setWorkPhone(String workPhone) {
			this.workPhone = workPhone;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getAdharcard() {
			return adharcard;
		}
		public void setAdharcard(String adharcard) {
			this.adharcard = adharcard;
		}
		public String getPanCard() {
			return panCard;
		}
		public void setPanCard(String panCard) {
			this.panCard = panCard;
		}
		public String getPassport() {
			return passport;
		}
		public void setPassport(String passport) {
			this.passport = passport;
		}
		public String getAdharcardfilename() {
			return adharcardfilename;
		}
		public void setAdharcardfilename(String adharcardfilename) {
			this.adharcardfilename = adharcardfilename;
		}
		public String getPancardfilename() {
			return pancardfilename;
		}
		public void setPancardfilename(String pancardfilename) {
			this.pancardfilename = pancardfilename;
		}
		public String getPassportcardfilename() {
			return passportcardfilename;
		}
		public void setPassportcardfilename(String passportcardfilename) {
			this.passportcardfilename = passportcardfilename;
		}
		public String getSsc() {
			return ssc;
		}
		public void setSsc(String ssc) {
			this.ssc = ssc;
		}
		public String getHsc() {
			return hsc;
		}
		public void setHsc(String hsc) {
			this.hsc = hsc;
		}
		public String getSscState() {
			return sscState;
		}
		public void setSscState(String sscState) {
			this.sscState = sscState;
		}
		public String getHscState() {
			return hscState;
		}
		public void setHscState(String hscState) {
			this.hscState = hscState;
		}
		public String getSscdocname() {
			return sscdocname;
		}
		public void setSscdocname(String sscdocname) {
			this.sscdocname = sscdocname;
		}
		public String getHscdocname() {
			return hscdocname;
		}
		public void setHscdocname(String hscdocname) {
			this.hscdocname = hscdocname;
		}
		public String getUgname() {
			return ugname;
		}
		public void setUgname(String ugname) {
			this.ugname = ugname;
		}
		public String getPgname() {
			return pgname;
		}
		public void setPgname(String pgname) {
			this.pgname = pgname;
		}
		public String getStateug() {
			return stateug;
		}
		public void setStateug(String stateug) {
			this.stateug = stateug;
		}
		public String getStatepg() {
			return statepg;
		}
		public void setStatepg(String statepg) {
			this.statepg = statepg;
		}
		public String getUgdocfilename() {
			return ugdocfilename;
		}
		public void setUgdocfilename(String ugdocfilename) {
			this.ugdocfilename = ugdocfilename;
		}
		public String getPgdocfilename() {
			return pgdocfilename;
		}
		public void setPgdocfilename(String pgdocfilename) {
			this.pgdocfilename = pgdocfilename;
		}
		public String getEmergencyno() {
			return emergencyno;
		}
		public void setEmergencyno(String emergencyno) {
			this.emergencyno = emergencyno;
		}
		public String getRelation() {
			return relation;
		}
		public void setRelation(String relation) {
			this.relation = relation;
		}
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		public String getBankacno() {
			return bankacno;
		}
		public void setBankacno(String bankacno) {
			this.bankacno = bankacno;
		}
		public String getBankifsc() {
			return bankifsc;
		}
		public void setBankifsc(String bankifsc) {
			this.bankifsc = bankifsc;
		}
		public String getBankpass() {
			return bankpass;
		}
		public void setBankpass(String bankpass) {
			this.bankpass = bankpass;
		}
		public String getResumefilename() {
			return resumefilename;
		}
		public void setResumefilename(String resumefilename) {
			this.resumefilename = resumefilename;
		}
		public String getProfilepicfilename() {
			return profilepicfilename;
		}
		public void setProfilepicfilename(String profilepicfilename) {
			this.profilepicfilename = profilepicfilename;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCpassword() {
			return cpassword;
		}
		public void setCpassword(String cpassword) {
			this.cpassword = cpassword;
		}
		public String getEmployeeID() {
			return employeeID;
		}
		public void setEmployeeID(String employeeID) {
			this.employeeID = employeeID;
		}
		public String getEmpstatus() {
			return empstatus;
		}
		public void setEmpstatus(String empstatus) {
			this.empstatus = empstatus;
		}
		@Override
		public String toString() {
			return "hrmmodel [id=" + id + ", firstName=" + firstName + ", middleName=" + middleName + ", lastName="
					+ lastName + ", dob=" + dob + ", gender=" + gender + ", personalEmail=" + personalEmail
					+ ", personalPhone=" + personalPhone + ", currentAddress=" + currentAddress + ", permanentAddress="
					+ permanentAddress + ", currentCity=" + currentCity + ", permanentCity=" + permanentCity
					+ ", currentState=" + currentState + ", permanentState=" + permanentState + ", currentCountry="
					+ currentCountry + ", permanentCountry=" + permanentCountry + ", currentPostal=" + currentPostal
					+ ", permanentPostal=" + permanentPostal + ", companyName=" + companyName + ", jobTitle=" + jobTitle
					+ ", priveouDepartment=" + priveouDepartment + ", lastjoinDate=" + lastjoinDate
					+ ", workExperience=" + workExperience + ", joinDate=" + joinDate + ", department=" + department
					+ ", designation=" + designation + ", workEmail=" + workEmail + ", workPhone=" + workPhone
					+ ", location=" + location + ", adharcard=" + adharcard + ", panCard=" + panCard + ", passport="
					+ passport + ", adharcardfilename=" + adharcardfilename + ", pancardfilename=" + pancardfilename
					+ ", passportcardfilename=" + passportcardfilename + ", ssc=" + ssc + ", hsc=" + hsc + ", sscState="
					+ sscState + ", hscState=" + hscState + ", sscdocname=" + sscdocname + ", hscdocname=" + hscdocname
					+ ", ugname=" + ugname + ", pgname=" + pgname + ", stateug=" + stateug + ", statepg=" + statepg
					+ ", ugdocfilename=" + ugdocfilename + ", pgdocfilename=" + pgdocfilename + ", emergencyno="
					+ emergencyno + ", relation=" + relation + ", bankname=" + bankname + ", bankacno=" + bankacno
					+ ", bankifsc=" + bankifsc + ", bankpass=" + bankpass + ", resumefilename=" + resumefilename
					+ ", profilepicfilename=" + profilepicfilename + ", password=" + password + ", cpassword="
					+ cpassword + ", employeeID=" + employeeID + ", empstatus=" + empstatus + "]";
		}

		
	    
	    

		
}
