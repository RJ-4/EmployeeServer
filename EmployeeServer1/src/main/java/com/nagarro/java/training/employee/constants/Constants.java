package com.nagarro.java.training.employee.constants;

public class Constants {

	public static final String BASE_PACKAGE_FOR_SCAN = "com.nagarro.java.training.employee";
	
	public static final String COMPONENT_SCAN = "{" + BASE_PACKAGE_FOR_SCAN + "}";
	
	public static final String HIBERNATE_CONFIG_PROPERTIES_LOCATION = "classpath:application.properties";

	public static final String RESOURCE_HANDLER = "/resources/**";
	
	public static final String RESOURCE_LOCATION = "/resources/";
	
	public static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/views/";
	
	public static final String VIEW_RESOLVER_SUFFIX = ".jsp";
	
	public static final String GET_ALL_EMPLOYEES_QUERY = "FROM Employee";
	
	public static final String HIBERNATE_CONFIG_FILE = "hibernate.cfg.xml";
	
	public static final String UPDATE_EMPLOYEE_QUERY = "UPDATE Employee SET employeeName = :employeeName, "
																			+ "employeeLocation = :employeeLocation, "
																			+ "employeeEmail = :employeeEmail, "
																			+ "dateOfBirth =:dateOfBirth WHERE "
																			+ "employeeCode =:employeeCode";

	public static final String GET_SELECTED_EMPLOYEE_QUERY = "FROM Employee WHERE employeeCode = :employeeCode";

	public static final int EMPLOYEE_NOT_FOUND_ERROR_CODE = 404;
	
	public static final String INTERNAL_SERVER_ERROR_MESSAGE = "Server failed to process your request!!!";
	
	public static final int INTERNAL_SERVER_ERROR_CODE = 500;

}
