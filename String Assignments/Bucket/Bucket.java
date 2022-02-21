import java.util.*;
class Bucket 
{
  
      private String data;
      private int counter;
      private int value;
   
     public String getData() {
     return data;
     }
   
     public int getCounter() {
     return counter;
     }

     public int getValue()   {
     return value;
     }
   
    
    public void setData(String newData) {
     this.data= newData;
      }
   
    public void setCounter(int newCounter) {
     this.counter= newCounter;
     }
  
     public void setValue(int newValue) {
       this.value= newValue;
       }
     
     public Bucket() {
      }



        public static void main(String[]args) 
     
      {
        System.out.println("Enter the String to be reversed: ");
      
        Scanner sc = new Scanner (System.in);
    
        String str = sc.next();
      
        Testing test= new Testing();
        
        Bucket bkt = new Bucket();
       
        bkt.setData(test.reverse(str));
      
        System.out.println(bkt.getData());
       
        System.out.println("Enter a String to see char count: " );
   
        Scanner sc2 = new Scanner(System.in);
     
        char c =sc2.next().charAt(0);

        bkt.setCounter(test.countChars(str,c));
       
        System.out.println(bkt.getCounter());
       
        System.out.println("Num in the given string: ");
     
        bkt.setValue(test.transfer(str,c));
     
        System.out.println(bkt.getValue());
      }
  
 }
   
  
        

     
   
          