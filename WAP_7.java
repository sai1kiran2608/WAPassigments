//23-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts a number as year, between 1 and 9999 inclusive. If the number is not in range, print appropriate error message.
//If in range, calculate and print whether the given year is a leap year or not.
//Hint: A year is leap year if it is divisible by 4 and 400 but not by 100.
public class WAP_7 {

	public static void ValidateLeapYear(int year) {

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("The year " + year + " is a Leap year.");
		} else {
			System.out.println("The year " + year + " is not a Leap year.");
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year to check whether its a Leap year: ");
		int year = scanner.nextInt();

		scanner.close();

		if (year >= 1 && year <= 9999) {
			ValidateLeapYear(year);
		} else {
			System.out.println("Year range out of bound.");
		}

	}

}
