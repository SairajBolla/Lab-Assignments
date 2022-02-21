import java.util.*;
import java.io.*;

class Exercise5
{
   public static void main(String args[])throws IOException
     {
       int nooflines=1,
       int noofwords=0;  
         
       char ch;

       Scanner sc=new Scanner(System.in);

       System.out.print("\nEnter File name: ");

       String str=sc.nextLine();

       FileInputStream fi=new FileInputStream(str);

       int noofchars=fi.available();

       for(int i=0;i<noofchars;i++)
       {
           ch=(char)fi.read();

           if(ch=='\n')

            nooflines++;

           else if(ch==' ')

           noofwords++;
                                                                       
        }
    System.out.println("\nNumber of lines : "+ nooflines);
    System.out.println("\nNumber of words : "+ (nooflines+noofwords));
    System.out.println("\nNumber of characters : "+ noofchars);
                       

  }
}