package com.nagarro.java.training.employee.service.impl;

import com.nagarro.java.training.employee.dao.AddEmployeeDao;
import com.nagarro.java.training.employee.dao.impl.AddEmployeeDaoImpl;
import com.nagarro.java.training.employee.model.Employee;
import com.nagarro.java.training.employee.service.AddEmployeeService;

public class AddEmployeeServiceImpl implements AddEmployeeService{

	AddEmployeeDao addEmployeeDao;
	
	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		
		addEmployeeDao = new AddEmployeeDaoImpl();
		
		return addEmployeeDao.addEmployee(employee);
		
	}

}
