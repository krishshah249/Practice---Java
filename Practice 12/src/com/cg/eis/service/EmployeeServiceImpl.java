package com.cg.eis.service;

import com.cg.eis.bean.Employee;
import com.cg.eis.dao.EmployeeServiceDAOImpl;
import com.cg.eis.exceptions.InvalidSalaryAndDesignationException;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeServiceDAOImpl esi = new EmployeeServiceDAOImpl(); 
	
	@Override
	public boolean addEmployee(int id, String name, double salary, String designation){
		// TODO Auto-generated method stub
		
		try {
			esi.addEmployee(id,name,salary,designation,getScheme(salary, designation));
		} catch (InvalidSalaryAndDesignationException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}
	public String getScheme(double salary, String designation) throws InvalidSalaryAndDesignationException {
		// TODO Auto-generated method stub
		if(salary>=5000 && salary<20000 && designation.equalsIgnoreCase("system associate"))
			return "Scheme C";
		else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("programmer"))
			return "Scheme B";
		else if(salary>=40000 && designation.equalsIgnoreCase("manager"))
			return "Scheme A";
		else if(salary<5000 && designation.equalsIgnoreCase("clerk"))
			return "No Scheme";
		else
			throw new InvalidSalaryAndDesignationException("Invalid salary and designation",salary,designation);
	}
	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		esi.deleteEmployee(id);
		return true;
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return esi.findEmployee(id);
	}
	
	public void printDetails(int id) {
		
		if(findEmployee(id)==null)
			System.out.println("Employee Does Not Exists");
		else
			printAllDetails(findEmployee(id));
		
	}
	
	@Override
	public boolean updateName(int id,String name) {
		// TODO Auto-generated method stub
		Employee value= findEmployee(id);
		value.setName(name);
		if(esi.updateEmployee(value))
			return true;
		else
			return false;
	}

	public boolean updateSalary(int id,double salary) {
		// TODO Auto-generated method stub
		
		Employee value= findEmployee(id);
		try {
		getScheme(salary,value.getDesignation());
		value.setSalary(salary);
		esi.updateEmployee(value);
		return true;
		}
		catch(InvalidSalaryAndDesignationException i) {
			return false;
		}
	}
	
	public boolean updateDesignation(int id,String designation) {
		// TODO Auto-generated method stub
		
		Employee value= findEmployee(id);
		try {
			getScheme(value.getSalary(),designation);
			value.setDesignation(designation);
			esi.updateEmployee(value);
			return true;
			}
			catch(InvalidSalaryAndDesignationException i) {
				return false;
			}
	}
	
	public boolean validId(String temp) {
		
		return Validator.validatedata(temp, Validator.aidpattern);
	}

	public boolean validName(String temp) {
		
		return Validator.validatedata(temp, Validator.namepattern);
	}

	public boolean validSalary(String temp) {
	
	return Validator.validatedata(temp, Validator.salarypattern);
	}
	
	public boolean validDesignation(String temp) {
		
		return Validator.validatedata(temp, Validator.designationpattern);
		}
	
	public boolean checkId(int id) {
		
		
		return true;
	}

}
