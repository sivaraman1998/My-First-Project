package com.stringprog;

public class String_Program4 {

	static String s1 = "SOFTWARE TESTING";// to count the letters
	static int count = 0;
	static char i;
	static int j;

	public static void repeatedWords() {

		for (i = 'A'; i <= 'Z'; i++) {
			count = 0;
			for (j = 0; j < s1.length(); j++) {
				if (i == s1.charAt(j)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(i + " - " + count + " times ");
			}
		}
	}

	public static void main(String[] args) {
		repeatedWords();
	}
}
