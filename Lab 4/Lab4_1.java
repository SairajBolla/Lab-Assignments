import java.util.Random;

class Person
{
  private String name;
  private double age;
  
  public String getName()
  {
  return name;
  }
  
  public void setName(String name)
  {
   this.name = name;
  }
  
  public double getAge()
  {
  return age;
  }
  
  public void setAge(double age)
  {
   this.age = age;
  }
}


class Account 
{
  private long accNum;
  private double balance;
  private Person accHolder;

  public long getAccNum()
  {
  return accNum;
  }
  
  public void setAccNum(int accNum)
  {
   this.accNum = accNum;
  }
  
  public double getBalance()
  {
  return balance;
  }
  
  public void setBalance(double balance)
  {
   this.balance = balance;
  }

  public Person getAccHolder()
  {
  return accHolder;
  }
  
  public void setAccHolder(Person accHolder)
  {
   this.accHolder = accHolder;
  }


  public void deposit(double addamount)
  {
   balance = balance + addamount;
  }

   public void withdraw(double drawamount)
  {
   balance = balance - drawamount;
  }

}


class SavingsAccount extends Account
{
   final int minbalance = 500;
   public void withdraw(double drawamount)
   {
   
   if(getBalance() >= minbalance+drawamount)
   {
   double d1 = getBalance() - drawamount;
   setBalance(d1);
   System.out.println("Balance :"+d1);
   }
   else
   { 
    System.out.println("Minimum balance required");
   }
 
   }

}



class CurrentAccount extends Account
{
   int limit = 500;
   public void withdraw(double drawamount)
   {
  
   if(getBalance() >=limit+drawamount)
   {
   double d2 = getBalance() - drawamount;
   setBalance(d2);
   System.out.println("Balance :"+d2);
   }
   else
   { 
   System.out.println("Minimum balance required");  
   }
 
   }

}

class L4_1
{

  public static void main(String[] args)
  {
    Random r1 = new Random();

  SavingsAccount p = new SavingsAccount();
  Person p1 = new Person();

   p.setAccNum(r1.nextInt(10000));
   p1.setAge(23);
   p1.setName("smitha");
   p.setBalance(2000);
   p.deposit(2000);

   double bal1= p.getBalance();
   System.out.println(bal1);

   CurrentAccount pp = new CurrentAccount();
   Person p2 = new Person();

   pp.setAccNum(r1.nextInt(10000));
   p2.setAge(24);
   p2.setName("Kathy");
   pp.setBalance(3000);
   pp.withdraw(2000);

   double bal2= pp.getBalance();
   System.out.println(bal2);
  }

}
