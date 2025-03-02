//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

/*
WAP that accepts a number between 1 and 1000 inclusive. If the given number is not in range or a negative number, print appropriate fail message.
Convert each digit in the given number as word.
Ex: 1234 is given then it should print "One Two Three Four"
100 is given then it should print "One Zero Zero"
Additional: Enhance the above program to print the given number with place values. 
Ex: 1234 is given then it should print "One Thousand Two Hundred and Thirty Four"
100 is given it should print "One Hundred"
*/
public class WAP_15 {

	public static String numberToWords(int num) {
		if (num < 1 || num > 1000) {
			return "Invalid input! Enter a number between 1 and 1000.";
		}

		if (num == 1000) {
			return "One Thousand";
		}

		String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
		String[] teens = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
				"Eighteen", "Nineteen" };
		String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		String result = "";

		if (num >= 100) {
			result += ones[num / 100] + " Hundred";
			num %= 100;
			if (num > 0) {
				result += " and ";
			}
		}

		if (num >= 20) {
			result += tens[num / 10];
			num %= 10;
			if (num > 0) {
				result += " " + ones[num];
			}
		} else if (num >= 10) {
			result += teens[num - 10];
		} else if (num > 0) {
			result += ones[num];
		}

		return result;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter any number between 1 and 1000: ");
		int number = scanner.nextInt();
		scanner.close();
		
		System.out.println(numberToWords(number));
	}

}
