import java.util.Scanner;
public class Exercise4 {

	public static int mNumber(int n) 
      {
       StringBuffer sb = new StringBuffer();
		String str = Integer.toString(n);
		for (int i = 0; i < str.length() - 1; i++) {
			int difference = (int) (str.charAt(i) - str.charAt(i + 1));
			sb.append(Math.abs(difference));
		}
		sb.append((int) Math.abs(str.charAt(str.length() - 1) - str.charAt(0)));
		return Integer.parseInt(sb.toString());

	}

	public static void main(String[] args) 
      {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Num to be Modified:");
        
        
         
          int A = mNumber(sc.nextInt());

		System.out.println(A);
	}

}