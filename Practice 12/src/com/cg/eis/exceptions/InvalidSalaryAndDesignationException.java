package com.cg.eis.exceptions;

public class InvalidSalaryAndDesignationException extends Exception{
	
	double salary;
	String designation;
	
	public InvalidSalaryAndDesignationException(){
		
	}
	
	public InvalidSalaryAndDesignationException(String msg, double salary, String designation){
		
		super(msg);
		this.salary=salary;
		this.designation=designation;
	}
	
	public String toString() {
		
		return "InvalidSalaryAndDesignationException:[Salary: "+salary+" Designation: "+designation+"]"+super.getMessage();
		
	}
	
}
