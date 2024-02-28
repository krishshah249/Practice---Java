
package com.cg.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.bean.Department;
import com.cg.bean.Employee;


public class EmployeeRepository implements EmpRepositoryInterface {
	Map<Integer, Employee> empList = new HashMap<>();
	Map<Integer, Department> departList = new HashMap<>();

	@Override
	public boolean addEmplyee(Employee emp) {
		empList.put(emp.getEmployeeId(), emp);
		return false;
	}

	@Override
	public boolean removeEmployee(Employee emp) {
		try {
			empList.remove(emp.getEmployeeId());
			return true;
		} catch (NullPointerException e) {
			System.out.println("Something went wrong");
			return false;
		}
	}

	@Override
	public Employee findEmployee(Integer id) {
		return empList.get(id);
	}

	@Override
	public Collection<Employee> getAllEmployee() {
		return empList.values();
	}

	@Override
	public boolean addDepartment(Department d) {
		departList.put(d.getDepartmentId(), d);
		return true;
	}

	@Override
	public boolean removeDepartment(Department d) {
		try {
			departList.remove(d.getDepartmentId());
			return true;
		} catch (NullPointerException e) {
			System.out.println("Something went wrong");
			return false;
		}
	}

	@Override
	public Department findDepartment(Integer id) {
		return departList.get(id);
	}

	@Override
	public Collection<Department> getAllDepartment() {
		return departList.values();
	}
}
