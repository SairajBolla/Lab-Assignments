package com.abc.eis.exception;

import com.abc.eis.bean.Employee;
import com.abc.eis.pl.EmployeeServiceImpl;

public class CheckException {
	
	
	public void checkSalary() {
		
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		
		Employee emp1 = emp.getEmpDetails();
		
		if(emp1.salary<3000) {
			
			double salary = emp1.salary;
			
			try {
				
				throw new EmployeeException("salary less than 3000 :"+ salary);
				
			}
			catch(EmployeeException e) {
				
				System.out.println(e.getMessage());
				
			}
		}
		
		else
		{
			String scheme = emp.insuranceScheme(emp1.designation, emp1.salary);
			Employee person = new Employee(emp1.empId,emp1.name,emp1.designation,scheme,emp1.salary);
			emp.EmpDetails(person);
		}
		
		
	}

}
