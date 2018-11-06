package com.nagarro.java.training.employee.service.impl;

import com.nagarro.java.training.employee.dao.UpdateEmployeeDao;
import com.nagarro.java.training.employee.dao.impl.UpdateEmployeeDaoImpl;
import com.nagarro.java.training.employee.model.Employee;
import com.nagarro.java.training.employee.service.UpdateEmployeeService;

public class UpdateEmployeeServiceImpl implements UpdateEmployeeService {

	UpdateEmployeeDao updateEmployeeDao;
	
	public Employee updateEmployee(Employee employee){
		
		updateEmployeeDao = new UpdateEmployeeDaoImpl();
		
		return updateEmployeeDao.updateEmployee(employee);
		
	}
}
