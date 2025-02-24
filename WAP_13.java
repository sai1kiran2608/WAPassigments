//23-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts a range between 1 and 1000 and prints all the palindromes in the range.
public class WAP_13 {

	public static void PrintPalindromesInRange(int number) {

		System.out.println("Palindromes in the range are: ");
		for (int i = 1; i <= number; ++i) {
			int ReversedNumber = 0;
			int Original = i;
			int temp = i;
			while (temp > 0) {
				int LastDigit = temp % 10;
				ReversedNumber = (ReversedNumber * 10) + LastDigit;
				temp /= 10;
			}
			if (ReversedNumber == Original) {
				System.out.println(Original + " ");
			}
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number between 1 and 1000 to print all the palindromes in its range: ");
		int number = scanner.nextInt();
		scanner.close();
		
		if(number >= 1 && number <= 1000) {
			PrintPalindromesInRange(number);
		} else {
			System.out.println("Error: out of range.");
		}
		
	}

}
