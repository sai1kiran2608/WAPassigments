//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

// WAP that accepts a string and generates new string with alternative characters in Upper and Lower case.
public class WAP_24 {

	public static String toAlternateCase(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (i % 2 == 0) {
				if (ch >= 'a' && ch <= 'z') {
					result += (char) (ch - 32);
				} else {
					result += ch;
				}
			} else {
				if (ch >= 'A' && ch <= 'Z') {
					result += (char) (ch + 32);
				} else {
					result += ch;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		
		scanner.close();
		
		System.out.println(toAlternateCase(str));

	}

}
