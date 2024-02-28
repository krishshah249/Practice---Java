package com.cg.dao;

import java.util.Collection;

import com.cg.bean.Department;
import com.cg.bean.Employee;


public interface EmpRepositoryInterface {
	public boolean addEmplyee(Employee emp);

	public boolean removeEmployee(Employee emp);

	public Employee findEmployee(Integer id);

	public Collection<Employee> getAllEmployee();

	public boolean addDepartment(Department d);

	public boolean removeDepartment(Department d);

	public Department findDepartment(Integer id);

	public Collection<Department> getAllDepartment();
}
