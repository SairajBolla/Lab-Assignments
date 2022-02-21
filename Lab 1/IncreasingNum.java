class IncreasingNum 

{
       boolean checkNumber(int n)
	   
	   {
           int num = n;

           boolean flag = false;

	       int a = num % 10;

           num = num/10;

           while(num>0)

	       {
          
           if(a <= num % 10)
		   {
               flag = true;
               break;
           }

              a = num % 10;

              num = num/10;
           }

     
           if(flag)

	           System.out.println("Digits are not in increasing order.");
           
	       else 
	  

                 System.out.println("Digits are in increasing order.");
      

	      return true;
	      


	   }


            public static void main(String args[])
				
			 {
				 
				  IncreasingNum Check =new IncreasingNum();
				   
				  Check.checkNumber(54321);

                   }



}