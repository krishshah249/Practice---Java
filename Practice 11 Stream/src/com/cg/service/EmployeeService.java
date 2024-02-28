package com.cg.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.cg.bean.Department;
import com.cg.bean.Employee;
import com.cg.dao.EmployeeRepository;


public class EmployeeService implements EmployeeServiceInterface {

	EmployeeRepository empRepo = new EmployeeRepository();

	Map<Integer, List<Integer>> departEmpLink = new HashMap<>();

	public void addEmp(Employee emp) {
		Integer depart = null;
		if (emp.getDepartment() == null && departEmpLink.get(null) == null) {
			departEmpLink.put(null, new ArrayList<Integer>());
		} else {
			depart = emp.getDepartment().getDepartmentId();
			if (!departEmpLink.containsKey(depart)) {
				departEmpLink.put(depart, new ArrayList<Integer>());
				empRepo.addDepartment(emp.getDepartment());
			}
		}
		departEmpLink.get(depart).add(emp.getEmployeeId());

		empRepo.addEmplyee(emp);
	}

	public void addDepart(Department depart) {
		empRepo.addDepartment(depart);
		departEmpLink.put(depart.getDepartmentId(), new ArrayList<Integer>());
	}

	@Override
	public double getSalarySum() {
		try {
			double result = 0.0;
			List<Employee> list = new ArrayList<>(empRepo.getAllEmployee());
			result = list.stream().mapToDouble(emp -> emp.getSalary()).sum();
			return result;
		} catch (NullPointerException e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	@Override
	public List<String> getDepartAndEmpCount() {
		return empRepo.getAllDepartment().stream().map(depart -> {
			List<Integer> emp_id = departEmpLink.get(depart.getDepartmentId());
			return depart.getDepartmentName() + " has Employees : " + emp_id.stream().count();
		}).collect(Collectors.toList());
	}

	@Override
	public List<Employee> getEmployeesWithoutDepartment() {
		return empRepo.getAllEmployee().stream().filter((emp -> emp.getDepartment() == null))
				.collect(Collectors.toList());
	}

	@Override
	public List<Department> getDepartmentWithoutEmployee() {
		return empRepo.getAllDepartment().stream().filter(dep -> departEmpLink.get(dep.getDepartmentId()).size() == 0)
				.collect(Collectors.toList());
	}

	@Override
	public Collection<String> getEmpAndManagerNames() {
		return empRepo.getAllEmployee().stream().map(emp -> {

			Integer manager_id = emp.getManagerId();
			if (manager_id == null) {
				return emp.getFirstName() + " " + emp.getLastName() + " --> No manager";
			} else {
				Employee e = empRepo.findEmployee(emp.getManagerId());
				return emp.getFirstName() + " " + emp.getLastName() + " --> " + e.getFirstName() + " "
						+ e.getLastName();
			}
		}).collect(Collectors.toList());
	}

	public Department findDepartment(Integer id) {
		return empRepo.findDepartment(id);
	}
}
