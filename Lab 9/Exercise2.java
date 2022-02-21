package com.abc.lambda;
interface Space {
	public StringBuffer str(String str);
}

public class Exercise2 {

	public static void main(String[] args) {

		StringBuffer str1 = new StringBuffer();
		Space obj = (str) -> {
			for (int i = 0; i < str.length(); i++) {
				str1.append(str.charAt(i) + " ");
			}
			return str1;
		};
		StringBuffer str2 = obj.str("CG");
		System.out.println(str2);
	}

}