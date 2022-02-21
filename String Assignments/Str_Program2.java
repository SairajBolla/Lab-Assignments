class Str_Program2
{
	public static int sumOfDigit(String str)
	{
		int len=str.length();
		 int sum=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum=sum+ Character.getNumericValue(ch);
				continue;
			}
			else
				return 0;	
		}
		return sum; 	
	}
	
	public static String lowerCaseString(String str)
	{
		String[] str1=str.split(" ");

		int cnt1=0,cnt2=0;

		for(int i=0;i<str1.length;i++)
		{
			if(cnt1==0 && str1[i].charAt(0)=='C' || str1[i].charAt(0)=='c')
			{
				String temp=str1[0];
				str1[0]=str1[i];
				str1[i]=temp;
				cnt1++;
			}
			else if(cnt1==0 && str1[i].charAt(0)=='M' || str1[i].charAt(0)=='m')
			{
				String temp=str1[2];
				str1[2]=str1[i];
				str1[i]=temp;
				cnt2++;
			}
			else if(cnt1==1&&cnt2==1)
				break;	
		}
		String jadhu=" ";
		for(int i=0;i<str1.length;i++)
		{
			jadhu=jadhu+str1[i]+" ";
		}

		return  jadhu.toLowerCase();
	}
	public static void main(String[] args)
	{
			System.out.println("First letter C & Second letter M with lowercase: "+lowerCaseString("My Company Name is Capgemini"));
			int result= sumOfDigit("12"); 

			if(result!=0)

			System.out.println("Sum of Digit: "+ result);	
			else
			System.out.println("Wrong Input");
	}
}