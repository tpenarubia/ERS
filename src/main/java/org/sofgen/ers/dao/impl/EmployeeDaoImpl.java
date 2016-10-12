package org.sofgen.ers.dao.impl;

import org.hibernate.criterion.Restrictions;
import org.sofgen.ers.dao.EmployeeDao;
import org.sofgen.ers.model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="employeeDao")
public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao{

	@Override
	public Employee findByEmpId(String empId) {
		return (Employee) getCurrentSession().createCriteria(Employee.class)
				.add(Restrictions.eq("empId", empId))
				.uniqueResult();
	}

}
