//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that loops between 1 and 1000 inclusive. Accept 2 numbers and print out the numbers that are divisible by given 2 numbers.
//Once after finding 5 numbers, come out of the loop and print the sum of all the 3 numbers.
public class WAP_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		scanner.close();

		int count = 0, sum = 0;

		for (int i = 1; i <= 1000; i++) {
			if (i % num1 == 0 && i % num2 == 0) {
				System.out.println(i);
				sum += i;
				count++;

				if (count == 5) {
					break;
				}
			}
		}

		System.out.println("Sum of these numbers: " + sum);
	}

}
