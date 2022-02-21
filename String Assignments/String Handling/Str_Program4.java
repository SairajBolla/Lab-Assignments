
public class Str_Program4
{
	public  static Person buildPerson(String pattern)
	{
		String loc="",name="";
		double sal=0;
		int len=pattern.length();
		int i=0;
		while(i<len)
		{
			if(!(pattern.charAt(i)=='N' && pattern.charAt(i+1)=='M'))
			{
				loc=loc+String.valueOf(pattern.charAt(i));	
			}
			else
			{
				i=i+2;
				break;
			}
			i++;
		}
		while(i<len)
		{
			if(!(pattern.charAt(i)=='S' && pattern.charAt(i+1)=='A'&& pattern.charAt(i+2)=='L'))
			{
				name=name+String.valueOf(pattern.charAt(i));
			}
			else
			{
				i=i+3;
				break;	
			}
			i++;	
		}
		String temp="";
		while(i<len)
		{
			temp=temp+String.valueOf(pattern.charAt(i));
			i++;	
		}
		sal=Double.parseDouble(temp)*1000;
		 Person p1=new Person(loc,name,sal);

		return p1;
	}
	public static String findGrade(Person person)
	{
		String grade="";
		double sal=person.getSalary();
		if(sal>25000)
			grade="A";
		else if(sal>=10000 && sal<=25000)
			grade="B";
		else
			grade="C";
		return grade;	
	}
	public static void main(String[] args)
	{
		String str="HydNMSai-RajSAL20";
		String str2="NYCNMAlex-KarrySAL30";
		Person p=buildPerson(str);
		System.out.println("Employee Loc:-"+p.getLoc());
		System.out.println("Employee Name:-"+p.getName());
		System.out.println("Employee Sal:-"+p.getSalary());
		 System.out.println("Grade:-"+findGrade(p));

		System.out.println();
		Person p1=buildPerson(str2);
		System.out.println("Employee Loc:-"+p1.getLoc());
		System.out.println("Employee Name:-"+p1.getName());
		System.out.println("Employee Sal:-"+p1.getSalary());
		 System.out.println("Grade:-"+findGrade(p1));	
	}
}