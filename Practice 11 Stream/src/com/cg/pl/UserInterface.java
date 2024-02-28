package com.cg.pl;

import com.cg.bean.Department;
import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.StringTokenizer;


public class UserInterface {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();

		// dummy data
		Employee emp = new Employee();
		emp.setEmployeeId(100);
		emp.setSalary(1000.00);
		emp.setFirstName("Tanmay");
		emp.setLastName("Pathak");
		emp.setDepartment(new Department(101, "AUTO", 100));
		service.addEmp(emp);

		emp = new Employee();
		emp.setEmployeeId(101);
		emp.setSalary(1000.00);
		emp.setManagerId(100);
		emp.setFirstName("Rohit");
		emp.setLastName("Rajput");
		emp.setDepartment(new Department(100, "Mac", 100));
		service.addEmp(emp);

		emp = new Employee();
		emp.setEmployeeId(102);
		emp.setManagerId(100);
		emp.setFirstName("Nikhal");
		emp.setLastName("Pathak");
		emp.setFirstName("kamal");
		emp.setDepartment(null);
		emp.setSalary(1000.00);
		service.addEmp(emp);

		service.addDepart(new Department(201, "Testing", null));

		System.out.println("Salary sum " + service.getSalarySum());
		System.out.println("\nEmp and salary count");
		service.getDepartAndEmpCount().stream().forEach(System.out::println);
		System.out.println("\nEmp withour department");
		service.getEmployeesWithoutDepartment().stream().forEach(System.out::println);
		System.out.println("\nDepartment without emp");
		service.getDepartmentWithoutEmployee().stream().forEach(System.out::println);
		;
		System.out.println("\nEmp and manager name");
		service.getEmpAndManagerNames().stream().forEach(System.out::println);

	}
}
