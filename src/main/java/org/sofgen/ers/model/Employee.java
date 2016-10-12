package org.sofgen.ers.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Employee")
public class Employee extends BaseEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5490879894368668061L;

	@Column(name="EMP_ID")
	private String empId;
	
	@ManyToOne(cascade =CascadeType.PERSIST)
	@JoinColumn(name="titleId")
	private ReferenceCode title;
	
	@Column(name="SUR_NAME")
	private String surname;
	
	@Column(name="FIRST_NAME")
	private String firstname;
	
	@Column(name="OTHER_NAME")
	private String othername;
	
	@Column(name="PREV_NAME")
	private String previousname;
	
	@Column(name="NAT_INS_NO")
	private String nationalInsuranceNo;
	
	@Column(name="INITIALS")
	private String initials;
	
	@Column(name="KNOWN_AS")
	private String knownAs;
	
	@ManyToOne(cascade =CascadeType.PERSIST)
	@JoinColumn(name="currentPositionId")
	private ReferenceCode currentPosition;
	
	@Column(name="HIEAR_LOCATION")
	private String hiearchyLocation;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="LENGHT_OF_SERVICE")
	private int lengthOfService;
	
	@Column(name="PASS_NUM")
	private String passportNumber;
	
	@Column(name="START_DATE")
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	@Column(name="CONT_SERV_DATE")
	@Temporal(TemporalType.DATE)
	private Date contServiceDate;
	
	@Column(name="DATE_OF_BIRTH")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;
	
	@ManyToOne(cascade =CascadeType.PERSIST)
	@JoinColumn(name="nationalityId")
	private ReferenceCode nationality;
	
	@ManyToOne(cascade =CascadeType.PERSIST)
	@JoinColumn(name="religionId")
	private ReferenceCode religion;
	
	@Column(name="nameChangedDate")
	@Temporal(TemporalType.DATE)
	private Date nameChangedDate;
	
	@ManyToOne(cascade =CascadeType.PERSIST)
	@JoinColumn(name="maritalStatusId")
	private ReferenceCode maritalStatus;
	
	@ManyToOne(cascade =CascadeType.PERSIST)
	@JoinColumn(name="genderId")
	private ReferenceCode gender;
	
	private String mobilePhone;
	
	private String workEmail;
	
	@ManyToOne(cascade =CascadeType.PERSIST)
	@JoinColumn(name="regionId")
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
	
	
}
