package com.nagarro.java.training.employee.exceptionMapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.nagarro.java.training.employee.errorMessage.ErrorResponseMessage;
import static com.nagarro.java.training.employee.constants.Constants.*;

@Provider
public class GenericExeceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable e) {
		
		ErrorResponseMessage errorResponseMessage = new ErrorResponseMessage(INTERNAL_SERVER_ERROR_CODE,
																			INTERNAL_SERVER_ERROR_MESSAGE);
		
		return Response.status(Status.INTERNAL_SERVER_ERROR).entity(errorResponseMessage).build();
	}
}
