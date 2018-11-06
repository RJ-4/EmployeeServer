package com.nagarro.java.training.employee.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nagarro.java.training.employee.dao.GetAllEmployeesDao;
import com.nagarro.java.training.employee.getSession.GetSession;
import com.nagarro.java.training.employee.model.Employee;

import static com.nagarro.java.training.employee.constants.Constants.*;

public class GetAllEmployeesDaoImpl implements GetAllEmployeesDao {

	GetSession getSession = new GetSession();
	
	@Override
	public List<Employee> getEmployeeList() {
		
		Session session = getSession.getSession(Employee.class);
		
		try{
		
			session.beginTransaction();
			
			String getAllEmployeesQuery = GET_ALL_EMPLOYEES_QUERY;
		
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery(getAllEmployeesQuery);
			
			@SuppressWarnings("unchecked")
			List<Employee> employeeList = query.getResultList();
			
			session.getTransaction().commit();
			
			System.out.println("Employees: " + employeeList);
			
			return employeeList;
		
		} finally {
			
			getSession.closeSession();
		}
	}

}
