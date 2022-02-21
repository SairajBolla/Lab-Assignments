package com.abc.eis.pl;

import java.util.Scanner;

import com.abc.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	public Employee getEmpDetails() {
		
		String designation;
		
		String insuranceScheme =null;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter employee id" );
		
		int id = sc.nextInt();
		
		
		System.out.println("Enter Employee salary");
		double salary = sc.nextDouble();
		
		System.out.println("Enter employee name");
		String name = sc.next();
		
		if(salary<5000)
		{
			designation="Clerk";
		}
		else if(salary>5000 && salary <20000)
		{
			designation =" System Associate";
		}
		else if(salary>=20000 && salary<40000) {
			designation="Programmer";
		}
		else
		{
			designation="Manager";
		}
		Employee emp = new Employee(id,name,designation,insuranceScheme,salary);
		return emp;
	}
	public String insuranceScheme(String designation, double salary) {
		String scheme;
		if (designation == "Clerk")
			scheme = "No scheme";
		else if (designation == "System Associate")
			scheme = "Scheme C";
		else if (designation == "programmer")
			scheme = "Scheme B";
		else
			scheme = "Scheme A";
		return scheme;

	}

	public void EmpDetails(Employee emp) {

		System.out.println("Employee Id " + emp.empId);
		System.out.println("Employee name " + emp.name);
		System.out.println("Employee designation " + emp.designation);
		System.out.println("Employee salary " + emp.salary);
		System.out.println("Employee insurancescheme " + emp.iScheme);
	}

}
