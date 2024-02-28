package com.cg.eis.dao;

import com.cg.eis.bean.Employee;
import com.cg.eis.exceptions.InvalidSalaryAndDesignationException;

public interface EmployeeServiceDAO {

	public boolean addEmployee(int id, String name, double salary, String designation, String insuranceScheme);
	public boolean deleteEmployee(int id);
	public Employee findEmployee(int id);
	public boolean updateEmployee(Employee e);

}
