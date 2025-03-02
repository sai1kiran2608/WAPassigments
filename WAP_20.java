//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts a string and counts total vowels and consonants in the given string.
public class WAP_20 {

	public static boolean isVowel(char ch) {

		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
			return true;
		default:
			return false;
		}
	}

	public static boolean isConsonant(char ch) {

		switch (ch) {
		case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
				'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z':
			return true;
		default:
			return false;
		}

	}

	public static int countVowels(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(isVowel(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static int countConsonants(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(isConsonant(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write a string: ");
		String str = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("No. of Vowels in '" + str + "' is " + countVowels(str));
		System.out.println("No. of Consonants in '" + str + "' is " + countConsonants(str));
		
	}

}
