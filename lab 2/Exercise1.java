
public class Exercise1
{
  
    public static int getSecondSmallest(int[] a)
   {  
    
      int temp;  
    
        for (int i = 0; i < a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {  
                while (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
      
        return a[1];
    }  

       public static void main(String args[])
       {  
    
         int a[]={1,5,6,3,2}; 
 
         int b[]={24,46,69,57,};
  
         System.out.println(getSecondSmallest(a)); 
 
         System.out.println(getSecondSmallest(b));  
       }

}  