class Person
{
	private String loc;
	private String name;
	private double salary;
	
	public Person(String loc,String name,double salary)
	{
		this.loc=loc;
		this.name=name;
		this.salary=salary;		
	}
	public void setLoc(String loc)
	{
		this.loc=loc;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;	
	}
	public String getLoc()
	{
		return loc;	
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;	
	}
}