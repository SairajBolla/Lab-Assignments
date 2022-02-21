import java.util.Scanner;
class Exercise2
{
	public static String getImage(String A)

      {
		StringBuilder str=new StringBuilder();

		str.append(A);

		StringBuilder reverse=str.reverse();

		return reverse.toString();
		
      }

	public static void main(String []args)

      {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Eneter a String to be reversed: ");

		String str=  sc.next();

		String x=Exercise2.getImage(str);

		System.out.println(str+" | "+x);
	}

}
		