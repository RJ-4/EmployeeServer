package com.nagarro.java.training.employee.errorMessage;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorResponseMessage {

	private int statusCode;
	
	private String message;

	public ErrorResponseMessage() {

	}
	
	public ErrorResponseMessage(int statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
