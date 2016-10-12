package org.sofgen.ers.controller.form;

import java.io.Serializable;
import java.util.Date;

import org.sofgen.ers.model.ReferenceCode;

public class EmployeeDetailForm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -306402140706256684L;
	
    private String empId;
	
	private ReferenceCode title;
	
	private String surname;

	private String firstname;
	
	private String othername;

	private String previousname;
	
	private String nationalInsuranceNo;
	
	private String initials;
	
	private String knownAs;
	
	private ReferenceCode currentPosition;
	
	private String hiearchyLocation;
	
	private int age;
	
	private int lengthOfService;
	
	private String passportNumber;
	
	private Date startDate;

	private Date contServiceDate;
	
	private Date dateOfBirth;
	
	private ReferenceCode nationality;
	
	private ReferenceCode religion;
	
	private Date nameChangedDate;
	
	private ReferenceCode maritalStatus;
	
	private ReferenceCode gender;
	
	private String mobilePhone;
	
	private String workEmail;

	private ReferenceCode region;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public ReferenceCode getTitle() {
		return title;
	}

	public void setTitle(ReferenceCode title) {
		this.title = title;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getOthername() {
		return othername;
	}

	public void setOthername(String othername) {
		this.othername = othername;
	}

	public String getPreviousname() {
		return previousname;
	}

	public void setPreviousname(String previousname) {
		this.previousname = previousname;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

	public void setNationalInsuranceNo(String nationalInsuranceNo) {
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public String getKnownAs() {
		return knownAs;
	}

	public void setKnownAs(String knownAs) {
		this.knownAs = knownAs;
	}

	public ReferenceCode getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(ReferenceCode currentPosition) {
		this.currentPosition = currentPosition;
	}

	public String getHiearchyLocation() {
		return hiearchyLocation;
	}

	public void setHiearchyLocation(String hiearchyLocation) {
		this.hiearchyLocation = hiearchyLocation;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLengthOfService() {
		return lengthOfService;
	}

	public void setLengthOfService(int lengthOfService) {
		this.lengthOfService = lengthOfService;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getContServiceDate() {
		return contServiceDate;
	}

	public void setContServiceDate(Date contServiceDate) {
		this.contServiceDate = contServiceDate;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public ReferenceCode getNationality() {
		return nationality;
	}

	public void setNationality(ReferenceCode nationality) {
		this.nationality = nationality;
	}

	public ReferenceCode getReligion() {
		return religion;
	}

	public void setReligion(ReferenceCode religion) {
		this.religion = religion;
	}

	public Date getNameChangedDate() {
		return nameChangedDate;
	}

	public void setNameChangedDate(Date nameChangedDate) {
		this.nameChangedDate = nameChangedDate;
	}

	public ReferenceCode getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(ReferenceCode maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public ReferenceCode getGender() {
		return gender;
	}

	public void setGender(ReferenceCode gender) {
		this.gender = gender;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getWorkEmail() {
		return workEmail;
	}

	public void setWorkEmail(String workEmail) {
		this.workEmail = workEmail;
	}

	public ReferenceCode getRegion() {
		return region;
	}

	public void setRegion(ReferenceCode region) {
		this.region = region;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
