package com.cg.eis;

public class EmployeeException extends Exception {
	
	
	public EmployeeException(String message) {
		super(message);
	}
	
	public String toString() {
		
		return "EmployeeException"+super.getMessage();
		
	}
}
