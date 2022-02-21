import java.util.Scanner;
public class Exercise2   
{
 
  
  public static void sortStrings(String [] strArray, int sizeOfArray)
   {
   
      String temp=null;
       
      for(int i=0;i<sizeOfArray;i++)
       {
         for(int j=1;j<sizeOfArray;j++)
         {
           if(strArray[j-1].compareToIgnoreCase(strArray[j]) > 0)
            {
                temp =  strArray[j-1];
                 strArray[j-1]=strArray[j];
                 strArray[j]=temp;
             }
         }
       }
       
        System.out.println("\n After Sorting..........");
        for( String s : strArray)
        System.out.println(s);
     
    }
   
 
 
   
  public static void main(String[]args)   
  
  {
    System.out.println("please enter the size of the array ");
    
    Scanner sc = new Scanner(System.in);
   
    int sizeOfArray = sc.nextInt();
    
    String [] strArray =new String[sizeOfArray]; 
   
    for(int i=0;i<sizeOfArray;i++)
    {
      System.out.println("please enter string" + (i+1) + ":");
      strArray[i] =sc.next();
     }
      
       System.out.println("\n Before Sorting..........");
       for( String s : strArray)
        System.out.println(s);
  
          
       sortStrings(strArray, sizeOfArray);
  }
}