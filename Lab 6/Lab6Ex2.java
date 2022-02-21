import java.util.*;


class Lab6Ex2  
 
{
 
    public static Map<Character,Integer> countCharacters(char array[])
  
    {
      
       Map<Character,Interger> map = new HashMap<>();
     
       for(int i=0;i<array.length;i++)
     
      {
            
        if(map.containskey(array[i]))
         {
            Integer n =map.get(array[i]);
            map.put(array[i],++n);
          }
 
         else
          {
            
            map.put(array[i],1);
           }
         return map;
      }
      
     public static void main(String args[])
      {
        
        Scanner sc= new Scanner(System.in);
       
        System.out.println("Enter Array Length :");
      
      char array[]=sc.next().toCharArray();
     
      Map<Character,Integer> map =  countCharacters(array);
   
      System.out.println(map);
    }
}