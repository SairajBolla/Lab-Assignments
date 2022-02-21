class  Primenum
{
	public static void main(String[] args) 
	{
		int n=1;
		boolean isprime=true;
		for(int i=1;i<n;i++)
		{
			if(i%n==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
		System.out.println(n+ " is a prime num");
		}
		else
			System.out.println(n + "is not a prime num");
	}
}
