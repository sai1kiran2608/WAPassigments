//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts two numbers month and year. Both month must be between 1 and 12 inclusive and year value must be between 1 and 9999 inclusive.
//Print the number of days in given month.
//Validation: If the given year is leap year and month as 2, then it must display 29 days, if not must print 28 days for month 2.
public class WAP_8 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter month (1-12): ");
		int month = scanner.nextInt();

		System.out.print("Enter year (1-9999): ");
		int year = scanner.nextInt();

		scanner.close();

		if (month < 1 || month > 12 || year < 1 || year > 9999) {
			System.out.println("Invalid input. Month must be between 1-12 and year between 1-9999.");
			return;
		}

		int days;

		if (month == 2) {
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
				days = 29;
			} else {
				days = 28;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;
		} else {
			days = 31;
		}

		System.out.println("Number of days: " + days);

	}

}
