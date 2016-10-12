package org.sofgen.ers.service.impl;

import java.util.Date;
import java.util.List;

import org.sofgen.ers.dao.EmployeeDao;
import org.sofgen.ers.model.Employee;
import org.sofgen.ers.model.ReferenceCode;
import org.sofgen.ers.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeDao employeeDao;
	

	@Override
	public List<Employee> getEmployeeList() {
		return employeeDao.listAllRecord();
	}

	@Override
	public Employee addEmployee(String empId, ReferenceCode title, String surname, String firstname, String othername,
			String previousname, String nationalInsuranceNo, String initials, String knownAs,
			ReferenceCode currentPosition, String hiearchyLocation, int age, int lengthOfService, String passportNumber,
			Date startDate, Date contServiceDate, Date dateOfBirth, ReferenceCode nationality, ReferenceCode religion,
			Date nameChangedDate, ReferenceCode maritalStatus, ReferenceCode gender, String mobilePhone,
			String workEmail) {
		
		Employee employee = new Employee();
		employee.setEmpId(empId);
		employee.setTitle(title);
		employee.setSurname(surname);
		employee.setFirstname(firstname);
		employee.setOthername(othername);
		employee.setPreviousname(previousname);
		employee.setNationalInsuranceNo(nationalInsuranceNo);
		employee.setInitials(initials);
		employee.setKnownAs(knownAs);
		employee.setCurrentPosition(currentPosition);
		employee.setHiearchyLocation(hiearchyLocation);
		employee.setAge(age);
		employee.setLengthOfService(lengthOfService);
		employee.setPassportNumber(passportNumber);
		employee.setStartDate(startDate);
		employee.setContServiceDate(contServiceDate);
		employee.setDateOfBirth(dateOfBirth);
		employee.setNationality(nationality);
		employee.setReligion(religion);
		employee.setNameChangedDate(nameChangedDate);
		employee.setMaritalStatus(maritalStatus);
		employee.setGender(gender);
		employee.setMobilePhone(mobilePhone);
		employee.setWorkEmail(workEmail);
		
		employeeDao.save(employee);
		
		return employee;
	}

	@Override
	public Employee updateEmployee(String empId, ReferenceCode title, String surname, String firstname,
			String othername, String previousname, String nationalInsuranceNo, String initials, String knownAs,
			ReferenceCode currentPosition, String hiearchyLocation, int age, int lengthOfService, String passportNumber,
			Date startDate, Date contServiceDate, Date dateOfBirth, ReferenceCode nationality, ReferenceCode religion,
			Date nameChangedDate, ReferenceCode maritalStatus, ReferenceCode gender, String mobilePhone,
			String workEmail) {
		
		Employee employee = employeeDao.findByEmpId(empId);
		
		employee.setEmpId(empId);
		employee.setTitle(title);
		employee.setSurname(surname);
		employee.setFirstname(firstname);
		employee.setOthername(othername);
		employee.setPreviousname(previousname);
		employee.setNationalInsuranceNo(nationalInsuranceNo);
		employee.setInitials(initials);
		employee.setKnownAs(knownAs);
		employee.setCurrentPosition(currentPosition);
		employee.setHiearchyLocation(hiearchyLocation);
		employee.setAge(age);
		employee.setLengthOfService(lengthOfService);
		employee.setPassportNumber(passportNumber);
		employee.setStartDate(startDate);
		employee.setContServiceDate(contServiceDate);
		employee.setDateOfBirth(dateOfBirth);
		employee.setNationality(nationality);
		employee.setReligion(religion);
		employee.setNameChangedDate(nameChangedDate);
		employee.setMaritalStatus(maritalStatus);
		employee.setGender(gender);
		employee.setMobilePhone(mobilePhone);
		employee.setWorkEmail(workEmail);
		
		employeeDao.update(employee);
		
		return employee;
	}

	@Override
	public boolean deleteEmployee(Long id) {
		boolean deleted = false;
		Employee employee = employeeDao.findById(id);
		
		if(employee != null && employee.getId() > 0){
			employeeDao.deleteById(id);
			deleted = true;
		}
		
		return deleted;
	}
}
