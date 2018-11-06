package com.nagarro.java.training.employee.exceptionMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.nagarro.java.training.employee.errorMessage.ErrorResponseMessage;
import com.nagarro.java.training.employee.exception.EmployeeNotFoundException;

import static com.nagarro.java.training.employee.constants.Constants.*;

@Provider
public class EmployeeNotFoundExceptionMapper implements ExceptionMapper<EmployeeNotFoundException>{

	@Override
	public Response toResponse(EmployeeNotFoundException e) {
	
		ErrorResponseMessage errorResponseMessage = new ErrorResponseMessage(EMPLOYEE_NOT_FOUND_ERROR_CODE,
																				e.getMessage());
	
		return Response.status(Status.NOT_FOUND).entity(errorResponseMessage).build();
	}

}
