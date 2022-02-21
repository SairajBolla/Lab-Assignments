import java.util.*;
import java.util.Scanner;
class Exercise1
{
	public static void main(String[] args)
      {
		int n;
            int sum = 0;
        Scanner sc = new Scanner(System.in);
        
          System.out.println("Enter a number:");
 
        String A = sc.next();

        StringTokenizer token = new StringTokenizer(A, " ");

        while (token.hasMoreTokens()) 

        {
            String temp = token.nextToken();

            n = Integer.parseInt(temp);

            System.out.println(n);

            sum = sum + n;
        }
        System.out.println("sum of the integers is: " + sum);
        sc.close();
    }
}