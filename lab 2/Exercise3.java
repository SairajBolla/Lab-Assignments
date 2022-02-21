class Exercise3  {
  
  
  public static int[] getSorted(int[] arr) 
  { 
    
      int[] reverse = new int[arr.length];
      
      int j=0;
      for(int i=arr.length-1; i>=0 ; i--)
         {
           reverse[j]=arr[i];
           j++;
         }
         return reverse;
  }
 
     public static void main(String[] args) 
      {
             int[] n = {1, 7, 8, 9};
              int[] a= getSorted(arr);
 
             System.out.println(" After reversing an array ");
 
             for(int i = 0; i < a.length; i++) 
             {
                 System.out.print(a[i]+" ");
             }
      }      

}  