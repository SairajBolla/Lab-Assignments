class PowerOfTwo 
{


	static boolean checkNumber(int n)  
	{

		int num=n;
		 
		if (n == 0)
            return false;
 
        while (n > 1) 
		{
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;

	}
        
	public static void main(String[] args) 
	{
		if (checkNumber(8))
			System.out.println("yes...");
			else
				System.out.println("no...");
		
	}
}
