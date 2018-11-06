package com.nagarro.java.training.employee.dao.impl;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.nagarro.java.training.employee.dao.GetSelectedEmployeeDao;
import com.nagarro.java.training.employee.exception.EmployeeNotFoundException;
import com.nagarro.java.training.employee.getSession.GetSession;
import com.nagarro.java.training.employee.model.Employee;

import static com.nagarro.java.training.employee.constants.Constants.*;

public class GetSelectedEmployeeDaoImpl implements GetSelectedEmployeeDao{

	GetSession newSession = new GetSession();
	
	@Override
	public Employee getSelectedEmployee(int employeeId) {

		try {
			
			Session session = newSession.getSession(Employee.class);
			
			session.beginTransaction();
			
			String getSelectedEmployeeQuery = GET_SELECTED_EMPLOYEE_QUERY;
			
			@SuppressWarnings("rawtypes")
			Query query = session.createQuery(getSelectedEmployeeQuery);
			
			query.setParameter("employeeCode", employeeId);
			
			Employee selectedEmployee = (Employee)query.getSingleResult();
			
			if(selectedEmployee == null) {
				
				throw new EmployeeNotFoundException("Employee with employee code: " + employeeId + "not found!!!");
			}
			
			session.getTransaction().commit();
			
			return selectedEmployee;
			
		} finally {
			
			newSession.closeSession();
		}
	}

}
