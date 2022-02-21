package com.abc.eis.exception;

public class EmployeeException extends Exception {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double salary;
	public  EmployeeException(String message, Throwable cause) {
		
		super(message, cause);
	}
	
	
	public EmployeeException(String message) {
		
		super(message);
	}
	
	public EmployeeException(double salary) {
		
		this.salary = salary;
	}
	public void catchEmployeeException() {
		try 
		{
			throw new EmployeeException("salary lessthan 3000: "+salary);
			
		}
		catch(EmployeeException e) {
			System.out.println(e.getMessage());
		}
	}

}
