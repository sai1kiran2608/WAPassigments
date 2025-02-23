//23-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts a number between 1 and 1000 inclusive.
//In the range find whether the number is prime or not, along with total number of factors found for each number.
//At the end print the total number of prime numbers found.
//Hint: Use appropriate messages for invalid input. Use proper data types and looping construct.
public class WAP_9 {

	public static void PrintPrimeNumbersInRange(int number) {

		System.out.println("Prime numbers till " + number + " are: ");
		for (int i = 2; i <= number; ++i) {
			int prime_check = 1;
			for (int j = 2; j < i; ++j) {
				if (i % j == 0) {
					prime_check = 0;
					break;
				}
			}
			if (prime_check == 1) {
				System.out.print(i + " ");
			}
		}

	}

	public static void PrintFactorsInRange(int number) {

		for (int i = 1; i <= number; ++i) {
			System.out.print("\n" + "The factors of " + i + " are: ");
			for (int j = 1; j <= i; ++j) {
				if (i % j == 0) {
					System.out.print(j + " ");
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter any number between 1 and 1000 inclusive: ");
		int number = scanner.nextInt();
		scanner.close();

		if (number >= 1 && number <= 1000) {
			PrintPrimeNumbersInRange(number);
			PrintFactorsInRange(number);
		} else {
			System.out.println("Number out of bound.");
		}
	}

}
