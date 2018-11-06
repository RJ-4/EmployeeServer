package com.nagarro.java.training.employee.service.impl;

import com.nagarro.java.training.employee.dao.GetSelectedEmployeeDao;
import com.nagarro.java.training.employee.dao.impl.GetSelectedEmployeeDaoImpl;
import com.nagarro.java.training.employee.model.Employee;
import com.nagarro.java.training.employee.service.FetchSelectedEmployeeService;

public class FetchSelectedEmployeeServiceImpl implements FetchSelectedEmployeeService {

	GetSelectedEmployeeDao getSelectedEmployeeDao;
	
	@Override
	public Employee fetchSelectedEmployee(int employeeCode) {
		
		getSelectedEmployeeDao = new GetSelectedEmployeeDaoImpl();
		
		return getSelectedEmployeeDao.getSelectedEmployee(employeeCode);
	}

}
