package org.sofgen.ers.service;

import java.util.Date;
import java.util.List;

import org.sofgen.ers.model.Employee;
import org.sofgen.ers.model.ReferenceCode;

public interface EmployeeService {
	
	List<Employee> getEmployeeList();
	
	Employee addEmployee(String empId,ReferenceCode title,String surname,
			String firstname, String othername, String previousname, String nationalInsuranceNo,
			String initials, String knownAs, ReferenceCode currentPosition, String hiearchyLocation,
			int age,int lengthOfService, String passportNumber,Date startDate,Date contServiceDate,
			Date dateOfBirth, ReferenceCode nationality, ReferenceCode religion, Date nameChangedDate,
			ReferenceCode maritalStatus, ReferenceCode gender, String mobilePhone, String workEmail);
	
	Employee updateEmployee(String empId,ReferenceCode title,String surname,
			String firstname, String othername, String previousname, String nationalInsuranceNo,
			String initials, String knownAs, ReferenceCode currentPosition, String hiearchyLocation,
			int age,int lengthOfService, String passportNumber,Date startDate,Date contServiceDate,
			Date dateOfBirth, ReferenceCode nationality, ReferenceCode religion, Date nameChangedDate,
			ReferenceCode maritalStatus, ReferenceCode gender, String mobilePhone, String workEmail);
    
	boolean deleteEmployee(Long id);
}

