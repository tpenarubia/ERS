package org.sofgen.ers.dao;

import org.sofgen.ers.model.Employee;

public interface EmployeeDao extends BaseDao<Employee>{

	Employee findByEmpId(String empId);
}
