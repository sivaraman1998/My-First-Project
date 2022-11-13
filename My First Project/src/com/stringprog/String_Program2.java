package com.stringprog;

public class String_Program2 {

	static String s1 = "HoMePaGe";
	static char temp;

	public static void method1() {
		char[] ch1 = s1.toCharArray();

		for (int i = 0; i < ch1.length; i++) {
			if (i % 2 == 1) {
				temp = s1.charAt(i);
				char upperCase1 = Character.toUpperCase(temp);
				System.out.print(upperCase1+" ");
			}
		}
	}

	public static void main(String[] args) {
		method1();
	}

}
