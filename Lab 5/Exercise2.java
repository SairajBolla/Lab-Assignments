

class InvalidNameException extends Exception
{
}
public class Exercise2
{
  public static void main(String args[])
  {
   
    String lname="kumar";

    String fname= "ravi";
   try
     {
        if(lname == null || lname.length() == 0 ||fname == null || fname.length() == 0)
           {
          System.out.println("lname or fname is null or empty");
            throw new InvalidNameException();
            }
         else
           System.out.println("The Full Name is: " + fname + lname);
     }
  
     catch(InvalidNameException e)
     {
       System.out.println("Caught");
       System.out.println(e.getMessage());
     }
  }
}