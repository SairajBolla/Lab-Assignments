package com.abc.eis.bean;

public class Employee {
	
	public int empId;
	
	public String name;
	
	public double salary;
	
	public String designation;
	
	
	public String  iScheme;


	public Employee(int empId, String name, String designation,String iScheme,double salary) {
		
		super();
		this.empId=empId;
		this.name = name;
		this.designation=designation;
		this.iScheme=iScheme;
		this.salary=salary;
	}
	public Employee() {
		
	}


	

}
