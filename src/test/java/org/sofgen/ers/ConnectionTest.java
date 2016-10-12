package org.sofgen.ers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sofgen.ers.dao.BaseDao;
import org.sofgen.ers.dao.EmployeeDao;
import org.sofgen.ers.dao.impl.EmployeeDaoImpl;
import org.sofgen.ers.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ConnectionTest {
	EmployeeDao empDao;
	//@Test
	public void TestConnection() {
		 AbstractApplicationContext appContext = 
				 new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
	     empDao = (EmployeeDao)appContext.getBean("employeeDao");
	}
//	@After
	public void cleanup(){
	   
	}
	//@Test
	public void EmptyTest(){}
}
