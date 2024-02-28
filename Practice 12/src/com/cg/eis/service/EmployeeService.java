package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	public boolean addEmployee(int id, String name, double salary, String designation);
	public boolean deleteEmployee(int id);
	public Employee findEmployee(int id);
	public boolean updateName(int id, String name);
	public boolean updateSalary(int id,double salary);
	public boolean updateDesignation(int id,String designation);
	
	public default void printAllDetails(Employee e) {
		
		System.out.println("Id: "+e.getId()+"Name: "+e.getName()+"Salary: "+e.getSalary()+"Designation: "+e.getDesignation()+
				"Scheme: "+e.getInsuranceScheme());
	}

}
