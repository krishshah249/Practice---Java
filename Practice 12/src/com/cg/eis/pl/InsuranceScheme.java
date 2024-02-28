package com.cg.eis.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cg.eis.exceptions.InvalidOption;
import com.cg.eis.service.EmployeeServiceImpl;

public class InsuranceScheme {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	EmployeeServiceImpl esi = new EmployeeServiceImpl(); 
	int id=0;
	String name=null;
	double salary=0.0; 
	String designation=null;
	String insuranceScheme=null;
	String choice=null;
	String choice1=null;
	String temp=null;
	System.out.println("Choose any of the option");
	
	// while loop of the input from user
	while(true) {
			
			System.out.println("1.Enter details and Add account");	// enter all the details 
			System.out.println("2.Delete account");	// delete account
			System.out.println("3.Update account");	// all the details of an employee 
			System.out.println("4.Get all the details of an employee"); // get all the details
			System.out.println("5.Exit");
			choice = br.readLine();
			switch(choice) {
			
			case "1":	
						// enter id
						System.out.println("Enter Employee Id");
						while(true) {
						temp= br.readLine();
						if(esi.validId(temp)) {
							id= Integer.parseInt(temp);
							break;
							}
						try {
						throw new InvalidOption("Id number is not valid");
						}
						catch(InvalidOption i) {
							
							System.out.println(i.getMessage());
						}
						}
						// enter name
						System.out.println("Enter Employee name");
						while(true) {
						temp= br.readLine();
						if(esi.validName(temp)) {
							name= temp;
							break;
						}
						try {
							throw new InvalidOption("Invalid First Name Or Last Name");
							}
							catch(InvalidOption i) {
								
								System.out.println(i.getMessage());
							}
						}
						// enter salary
						System.out.println("Enter Employee Salary");
						while(true) {
						temp= br.readLine();
						if(esi.validSalary(temp)) {
						salary= Double.parseDouble(temp);
						break;
						}
						try {
							throw new InvalidOption("Salary must be positive");
							}
							catch(InvalidOption i) {
								
								System.out.println(i.getMessage());
							}
						}
						// enter designation
						System.out.println("Enter Employee Designation");
						while(true) {
						temp= (br.readLine()).toLowerCase();
						if(esi.validDesignation(temp)) {
						designation= temp;
						break;
						}
						try {
							throw new InvalidOption("Designation type does not exists");
							}
							catch(InvalidOption i) {
								
								System.out.println(i.getMessage());
							}
						}
						if(esi.addEmployee(id,name,salary,designation))
							System.out.println("Employee Successfully Added");
						else
							System.out.println("Employee Not Added");
						break;
						
			case "2":	System.out.println("Enter the Employee id");
							
						while(true) {
							temp= br.readLine();
								if(esi.validId(temp)) {
									id= Integer.parseInt(temp);
									break;
								}
								try {
									throw new InvalidOption("Id number is not valid");
									}
									catch(InvalidOption i) {
										
										System.out.println(i.getMessage());
									}
							}
						if(esi.findEmployee(id)==null)
							System.out.println("Employee does not exists");
						else {
							esi.deleteEmployee(id);
							System.out.println("Employee account is deleted");
						}
						break;
			case "3":	
						System.out.println("Enter the Employee id");
				
						while(true) {
							temp= br.readLine();
								if(esi.validId(temp)) {
									id= Integer.parseInt(temp);
									break;
								}
								try {
									throw new InvalidOption("Id number is not valid");
									}
									catch(InvalidOption i) {
										
										System.out.println(i.getMessage());
									}
							}
						System.out.println("1. Update Name");
						
						System.out.println("2. Update Salary");
						
						System.out.println("3. Update Designation");
						
						System.out.println("Enter choice");
						
						choice1=br.readLine();
						switch(choice1) {
						
						case "1":	System.out.println("Enter New Name");
									
						while(true) {
							temp= br.readLine();
							if(esi.validName(temp)) {
								name= temp;
								break;
							}
							try {
								throw new InvalidOption("Invalid First Name And Last Name");
								}
								catch(InvalidOption i) {
									
									System.out.println(i.getMessage());
								}							}
									
									if(esi.updateName(id,name))
										System.out.println("Name Changed Successfully");
									else
										System.out.println("Name Not Changed");
									break;
							
						case "2":	System.out.println("Enter New Salary");
						
									while(true) {
											temp= br.readLine();
											if(esi.validSalary(temp)) {
												salary= Double.parseDouble(temp);
												break;
											}
											try {
												throw new InvalidOption("Salary must be positive");
												}
												catch(InvalidOption i) {
													
													System.out.println(i.getMessage());
												}
										}
									if(esi.updateSalary(id,salary))
										System.out.println("Salary Changed Successfully");
									else
										System.out.println("Salary Not Changed, Salary and Designation does not match");
									break;
						
							
						case "3":	System.out.println("Enter New Designation");
						
									while(true) {
										temp= (br.readLine()).toLowerCase();
											if(esi.validDesignation(temp)) {
												designation= temp;
													break;
											}
											try {
												throw new InvalidOption("Designation does not exists");
												}
												catch(InvalidOption i) {
													
													System.out.println(i.getMessage());
												}
										}
									if(esi.updateDesignation(id,designation))
										System.out.println("Designation Changed Successfully");
									else
										System.out.println("Designation Not Changed, Salary and Designation does not match");
									break;
						
						default: System.out.println("Enter Valid Option");
						}
			
						break;
			case "4":	System.out.println("Enter the Employee Id to get all the details");
						
						while(true) {
								temp= br.readLine();
								if(esi.validId(temp)) {
									id= Integer.parseInt(temp);
									break;
								}
								try {
									throw new InvalidOption("Id number is not valid");
									}
									catch(InvalidOption i) {
										
										System.out.println(i.getMessage());
									}
						}
						
						esi.printDetails(id);
						break;
			case "5":	
						System.exit(0);
				
				
			default: System.out.println("Enter Valid Option");
			
			}
			
		
		
	}
	}

}
