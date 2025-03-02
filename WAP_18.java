//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts 2 positive integers between 1 to 1000 inclusive. The program should calculate and print the number if it is perfect number.
//Hint: A perfect number is a positive integer which is equal to the sum of its proper positive divisors. 
//Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
//For example, take the number 6: 
//Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6. 
//Therefore, 6 is a perfect number (as well as the first perfect number).
public class WAP_18 {

	public static void checkAndPrintPerfectNumber(int number) {

		int sum = 1;

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				sum += i;
				sum += number / i;
			}
		}
		if (sum == number && number != 1) {
			System.out.println("The number " + number + " is a perfect number");
		} else {
			System.out.println("The number " + number + " is not a perfect number");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any number between 1 and 1000 to check whether it is a perfect number: ");
		int number = scanner.nextInt();

		scanner.close();

		if (number >= 1 && number <= 1000) {
			checkAndPrintPerfectNumber(number);
		} else {
			System.out.println("Out of bound.");
		}

	}
}
