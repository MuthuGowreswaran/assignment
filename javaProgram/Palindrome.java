package javaProgram;

public class Palindrome {

	public static void main(String[] args) {
		StringBuffer name = new StringBuffer("Amma");
		System.out.println(name);
		String value = name.toString();
		StringBuffer rev =name.reverse();
		System.out.println(rev);
		String re = rev.toString();
		boolean equals = value.equals(re);
		System.out.println(equals);
		if(value.equalsIgnoreCase(re)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		

	}

}
