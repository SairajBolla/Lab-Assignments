import java.util.Scanner;

public class Exercise3 {
	

	private static Scanner sc;

	static void validate(int sal)throws EmployeeException {
		
		if(sal<3000) 
		{
			
			
			System.out.println("Salary is not valid");
			
			throw new EmployeeException (null);
			
		}
		else {
			System.out.println("Salary is valid");
		}
	}
	
	public static void main(String[] args) 
	{
		
		sc = new Scanner(System.in);
            
            System.out.println("Enter the salary to validate: " );
		
		try 
		{
			
			validate(sc.nextInt());
			
		}
		catch(EmployeeException e)
		{
						
			System.out.println("Exception occured: " + e);
		}
		

	}

}

class EmployeeException extends Exception 
{
	public EmployeeException(String str) {
		  System.out.println(str);
	}
	
}