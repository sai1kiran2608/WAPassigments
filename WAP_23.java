//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts two strings and checks whether the second string exists in the first string.
public class WAP_23 {

	public static boolean checkSubstring(String str1, String str2) {
		int lenStr1 = str1.length();
		int lenStr2 = str2.length();

		for (int i = 0; i <= lenStr1 - lenStr2; i++) {
			int j;
			for (j = 0; j < lenStr2; j++) {
				if (str1.charAt(i + j) != str2.charAt(j)) {
					break;
				}
			}
			if (j == lenStr2) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter main string: ");
		String str1 = scanner.nextLine();

		System.out.println("Enter sub string: ");
		String str2 = scanner.nextLine();

		scanner.close();

		if (checkSubstring(str1, str2)) {
			System.out.println("Yes, its a substring.");
		} else {
			System.out.println("No, its not a substring.");
		}

	}

}
