package com.cg.bean;

import java.time.LocalDate;


public class Employee {
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private LocalDate HireDate;
	private String designation;
	private Double salary;
	private Integer managerId;
	private Department department;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeId, String firstName, String lastName, String email, String phoneNumber,
			LocalDate hireDate, String designation, Double salary, Integer managerId, Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		HireDate = hireDate;
		this.designation = designation;
		this.salary = salary;
		this.managerId = managerId;
		this.department = department;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDate getHireDate() {
		return HireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		HireDate = hireDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", HireDate=" + HireDate + ", designation=" + designation
				+ ", salary=" + salary + ", managerId=" + managerId + ", department=" + department + "]";
	}

}
