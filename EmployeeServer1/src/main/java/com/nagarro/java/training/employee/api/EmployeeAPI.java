package com.nagarro.java.training.employee.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.nagarro.java.training.employee.model.Employee;
import com.nagarro.java.training.employee.service.AddEmployeeService;
import com.nagarro.java.training.employee.service.FetchAllEmployeesService;
import com.nagarro.java.training.employee.service.FetchSelectedEmployeeService;
import com.nagarro.java.training.employee.service.UpdateEmployeeService;
import com.nagarro.java.training.employee.service.impl.AddEmployeeServiceImpl;
import com.nagarro.java.training.employee.service.impl.FetchAllEmployeesServiceImpl;
import com.nagarro.java.training.employee.service.impl.FetchSelectedEmployeeServiceImpl;
import com.nagarro.java.training.employee.service.impl.UpdateEmployeeServiceImpl;

@Path("/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeAPI {

	AddEmployeeService addEmployeeService;
	
	FetchAllEmployeesService fetchAllEmployees;
	
	UpdateEmployeeService updateEmployeeService;
	
	FetchSelectedEmployeeService fetchSelectedEmployeeService;
	
	@POST
	public Employee addEmployee(Employee employee) throws Exception{
		
		addEmployeeService = new AddEmployeeServiceImpl();
		
		return addEmployeeService.addEmployee(employee);
	}
	
	
	@GET
	public List<Employee> getEmployeeList() {
		
		fetchAllEmployees = new FetchAllEmployeesServiceImpl();

		return fetchAllEmployees.getEmployeeList();
	}
	
	@PUT
	@Path("/{employeeCode}")
	public Employee updateEmployee(Employee employee, @PathParam("employeeCode") int employeeCode){
		
		updateEmployeeService = new UpdateEmployeeServiceImpl();
		
		employee.setEmployeeCode(employeeCode);
		
		return updateEmployeeService.updateEmployee(employee);
		
	}
	
	@GET
	@Path("/{employeeCode}")
	public Employee getSelectedEmployee(@PathParam("employeeCode") int employeeCode) {

		fetchSelectedEmployeeService = new FetchSelectedEmployeeServiceImpl();
		
		return fetchSelectedEmployeeService.fetchSelectedEmployee(employeeCode);
			
	}
}
