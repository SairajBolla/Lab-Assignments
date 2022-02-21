class Testing 
{
      public int transfer(String str ,char c)  
      {
    
          Bucket b1 = new Bucket();
          int num=0;
          for(int i=0;i<=str.length();i++)
          {
           char ch = str.charAt(i);
           if(Character.isDigit(ch))
           {
             String s1=" ";       
             s1=s1+ch;
             int numb =Integer.parseInt(str);
             num=numb;
           }
          }
          return num;
     
       }
      
        public int countChars(String str, char c)  
        {
    
        int count = 0; 
     
        for(int i = 0; i < str.length(); i++)
            {    
            if(str.charAt(i) != ' ')    
                count++;    
             }    
             
       
        System.out.println("Total number of characters in a string: " + count);
 
        return count; 
    
        }
        



         public String reverse(String data) 
        {
   
             String rev="";
             char ch;
       
             for (int i=0; i< data.length(); i++)
             {
              ch= data.charAt(i); 
              rev = ch+rev; 
             }

             System.out.println("Reversed word: "+ rev);
             
             return rev;
         
         }

}
