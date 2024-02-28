package com.cg.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.exceptions.InvalidSalaryAndDesignationException;

public class EmployeeServiceDAOImpl implements EmployeeServiceDAO {
	
	Map<Integer,Employee> m = new HashMap<Integer,Employee>();
	

	@Override
	public boolean addEmployee(int id, String name, double salary, String designation, String insuranceScheme) {
		// TODO Auto-generated method stub
		try {
		m.put(id,new Employee(id,name,salary,designation,insuranceScheme));
		}
		catch(NullPointerException n) {
			return false;
		}
		return true;
	}
 
	@Override
	public boolean deleteEmployee(int id) {
		// TODO Auto-generated method stub
		if(m.remove(id)==null)
		return false;
		else
		return true;
	}

	@Override
	public Employee findEmployee(int id) {
		// TODO Auto-generated method stub
		return m.get(id);
		
	}

	@Override
	public boolean updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		
			m.put(e.getId(),e);	
			
			return true;
	}


}
