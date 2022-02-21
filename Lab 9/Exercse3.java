package com.abc.lambda;
interface Authentication {
	
	boolean checkIdentity(String username, String password);

}
public class Exercise3 {

	public static void main(String[] args) {

		String name = "sairaj";
		String pass = "msdhoni99";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("sairaj", "msdhoni99"));
	}
}