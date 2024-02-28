package com.cg.service;

import java.util.List;
import com.cg.bean.Department;
import com.cg.bean.Employee;
import java.util.Collection;

public interface EmployeeServiceInterface {
	public double getSalarySum();

	public List<String> getDepartAndEmpCount();

	public List<Employee> getEmployeesWithoutDepartment();

	public List<Department> getDepartmentWithoutEmployee();

	public Collection<String> getEmpAndManagerNames();
}
