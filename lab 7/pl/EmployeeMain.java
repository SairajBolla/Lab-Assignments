package com.abc.eis.pl;

import com.abc.eis.exception.CheckException;

public class EmployeeMain {
	
	
	public static void main(String[]args) {
		
		CheckException check = new CheckException();
		check.checkSalary();
	}

}
