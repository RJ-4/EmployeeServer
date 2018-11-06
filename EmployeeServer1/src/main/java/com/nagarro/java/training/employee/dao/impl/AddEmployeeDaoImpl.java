package com.nagarro.java.training.employee.dao.impl;

import org.hibernate.Session;

import com.nagarro.java.training.employee.dao.AddEmployeeDao;
import com.nagarro.java.training.employee.getSession.GetSession;
import com.nagarro.java.training.employee.model.Employee;

public class AddEmployeeDaoImpl implements AddEmployeeDao{

	GetSession newSession = new GetSession();
	
	@Override
	public Employee addEmployee(Employee employee) throws Exception {
		
		try{
			
			Session session = newSession.getSession(Employee.class);
		
			session.beginTransaction();
			
			session.save(employee);
		
			session.getTransaction().commit();
			
			return employee;
		
		} finally {
			
			newSession.closeSession();
		}
	
	}

}
