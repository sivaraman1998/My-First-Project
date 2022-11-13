package com.stringprog;

public class String_Program {

	static String s1 = "software testing";
	static char s2;
	static char s3;
	static char s4;// gnitset Software

	// For testing
	public static void testing() {
		for (int i = s1.length() - 1; i >= s1.length() - 7; i--) {
			s2 = s1.charAt(i);
			System.out.print(s2);
		}
		System.out.print(" ");
	}

	//For Software
	public static void subStringMethod() {
		String s3 = s1.substring(0, 1).toUpperCase() + s1.substring(1, 8);
		System.out.print(s3);
	}

	public static char concat() {
		s4 = (char) (s2 + s3);
		return s4;
	}

	public static void main(String[] args) {
		testing();
//		System.out.println();
		subStringMethod();
		System.out.println();
//		concat();
//		System.out.print(s4);
	}
}
