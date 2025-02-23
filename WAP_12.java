//23-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts an integer and checks if the given number is palindrome or not. The program must accept positive numbers only.
public class WAP_12 {

	public static boolean CheckPalindrome(int number) {

		int ReversedNumber = 0;
		int DuplicateNumber = number;
		while (number > 0) {
			int LastDigit = number % 10;
			ReversedNumber = (ReversedNumber * 10) + LastDigit;
			number /= 10;
		}
		if (ReversedNumber == DuplicateNumber)
			return true;
		else
			return false;
	}

	public static void ValidatePalindrome(int number) {
		boolean check = CheckPalindrome(number);
		if (check == true) {
			System.out.println("\nThe given number " + number + " is a palindrome.");
		} else {
			System.out.println("\nThe given number " + number + " is not a palindrome.");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter any positive number to check whether its a palindrome: ");
		int number = scanner.nextInt();

		scanner.close();

		if (number > 0) {
			ValidatePalindrome(number);
		} else {
			System.out.println("Error: The number is not positive!");
		}
	}

}
