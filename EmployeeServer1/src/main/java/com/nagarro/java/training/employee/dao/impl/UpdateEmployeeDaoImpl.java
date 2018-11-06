package com.nagarro.java.training.employee.dao.impl;

import org.hibernate.Session;

import org.hibernate.query.Query;

import com.nagarro.java.training.employee.dao.UpdateEmployeeDao;
import com.nagarro.java.training.employee.getSession.GetSession;
import com.nagarro.java.training.employee.model.Employee;

import static com.nagarro.java.training.employee.constants.Constants.*;

public class UpdateEmployeeDaoImpl implements UpdateEmployeeDao {

	GetSession newSession = new GetSession();
	
	@SuppressWarnings("rawtypes")
	@Override
	public Employee updateEmployee(Employee employee){
		
		try {
			
			Session session = newSession.getSession(Employee.class);
			
			session.beginTransaction();
			
			String updateEmployeeQuery = UPDATE_EMPLOYEE_QUERY;
			
			Query query = session.createQuery(updateEmployeeQuery);
			
			query.setParameter("employeeName", employee.getEmployeeName());
			query.setParameter("employeeLocation", employee.getEmployeeLocation());
			query.setParameter("employeeEmail", employee.getEmployeeEmail());
			query.setParameter("dateOfBirth", employee.getDateOfBirth());
			query.setParameter("employeeCode", employee.getEmployeeCode());
			
			query.executeUpdate();
			
			session.getTransaction().commit();
			
			return employee;
			
		} finally {
			
			newSession.closeSession();
			
		}
		
	}

}
