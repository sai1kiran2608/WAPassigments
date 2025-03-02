//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

// WAP that accepts a string and checks if the given string is palindrome or not.
public class WAP_19 {

	public static boolean checkPalindrome(String str) {

		char[] charArr = str.toCharArray();
		int size = charArr.length;

		for (int i = 0; i < size / 2; i++) {
			if (charArr[i] != charArr[size - 1 - i]) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkPalindromeEfficiently(String str) {
		int size = str.length();
		
		for(int i = 0; i < size / 2; i++) {
			if(str.charAt(i) != str.charAt(size - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		
		scanner.close();
		
		System.out.println(checkPalindromeEfficiently(str));
		
	}

}
