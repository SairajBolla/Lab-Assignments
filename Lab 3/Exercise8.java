import java.util.Arrays;
import java.util.Scanner;

public class Exercise8{

	public static void main(String[] args) {
   
         Scanner sc = new Scanner(System.in);
       
         System.out.println("Enter a String :");
            
            String str = sc.next();
		if (isAlphabaticOrder(str)) {
			System.out.println("String is in alphabetical order and the string is:  " + str);
		} else {
			System.out.println("String is not in alphabetical order");
		}
	}

	static boolean isAlphabaticOrder(String str) {
		int size = str.length();
		char[] arr = new char[size];
		for (int i = 0; i < size; i++) {
			arr[i] = str.charAt(i);
		}

		Arrays.sort(arr);
		for (int i = 0; i < size; i++) {
			if (arr[i] != str.charAt(i)) {

				return false;
			}
		}
		return true;
	}
}

