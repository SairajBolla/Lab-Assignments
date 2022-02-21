  public class SumOfSquares {
  
   
     int calculateDiff (int n)
     {
        
		int i,j,k;

       

		i=(n* (n+1) * (2*n+1))/6;

       

		j=(n*(n+1))/2;

      

		j=j*j;


		

		k= Math.abs(i-j);


  
	    return k;
     }
        
     
     public static void main (String []args)   
	{
  
    
       SumOfSquares s1 = new SumOfSquares();
     
 
       int differ=s1.calculateDiff(10);
      
       System.out.println("Difference: "+ differ);
    }
  

 }
    
   