package com.nagarro.java.training.employee.service.impl;

import java.util.List;

import com.nagarro.java.training.employee.dao.GetAllEmployeesDao;
import com.nagarro.java.training.employee.dao.impl.GetAllEmployeesDaoImpl;
import com.nagarro.java.training.employee.model.Employee;
import com.nagarro.java.training.employee.service.FetchAllEmployeesService;

public class FetchAllEmployeesServiceImpl implements FetchAllEmployeesService {

	GetAllEmployeesDao getAllEmployees;
	
	@Override
	public List<Employee> getEmployeeList() {
		
		getAllEmployees = new GetAllEmployeesDaoImpl();

		return getAllEmployees.getEmployeeList();
		
	}

}
