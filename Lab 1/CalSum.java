public class CalSum 
{
	
	int CalculatorSum(int n)
	{
	  int sum = 0;
	  int j=n;
	  if(j>1 && j%5==0 || j%3==0)
	  
		{
		  for(int i=1;i<j;i++)
			{
			 
			  sum=i+j;
			 
			}
		}
	
	return sum;
	}
    

	public static void main(String[] args) 
	{
	    CalSum sc= new CalSum();
	    int Total = sc.CalculatorSum(55);
	    System.out.println(Total);
	}

}
