package org.sofgen.ers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.sofgen.ers.dao.EmployeeDao;
import org.sofgen.ers.model.Employee;
import org.sofgen.ers.model.ReferenceCode;
import org.sofgen.ers.service.EmployeeService;
import org.sofgen.ers.service.ReferenceCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.mockito.Mock;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class EmployeeTest {
	@Autowired
	EmployeeDao employeeDao;
	
	
	ApplicationContext appContext;
	
	@Autowired
	EmployeeService employeeService;
	@Autowired
	ReferenceCodeService referenceCodeService;
	
	ReferenceCode title;
	

	@Test
	public void AddValues(){
		Date date = new Date();
		ReferenceCode title = referenceCodeService.findReferenceCodeByValue("VALUE1");
		ReferenceCode currentPosition = referenceCodeService.findReferenceCodeByValue("VALUE2");
		ReferenceCode nationality = referenceCodeService.findReferenceCodeByValue("VALUE3");
		ReferenceCode religion = referenceCodeService.findReferenceCodeByValue("VALUE4");
		ReferenceCode maritalStatus = referenceCodeService.findReferenceCodeByValue("VALUE5");
		ReferenceCode gender = referenceCodeService.findReferenceCodeByValue("VALUE6");
		
		
		employeeService.addEmployee("51007", title, "Penarubia", "Timothy", "none", "none", 
				"12345", "TP", "Mothy", currentPosition, "Manila", 21,
				21, "E1235AS", date, date, date, 
				nationality, religion, date, maritalStatus, gender, "09778220682", "mothypenarubia@gmail.com");
	}
	
	@After
	public void cleanup(){
	//	for(Employee emp : empDao.listAllRecord()){
		//   empDao.delete(emp);
	//	}
	}
	
}
