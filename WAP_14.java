//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts an integer between 10 and 99 inclusive. Valid message must be printed if any one or both values are not in the range.
//The program must print the digit the appears in both numbers. For example: if 12 and 51 are given, then it should print 1.
//since 1 is available in both the numbers.
public class WAP_14 {

	public static void occuranceOfDigits(String numStr1, String numStr2) {

		for (char ch1 : numStr1.toCharArray()) {
			for (char ch2 : numStr2.toCharArray()) {
				if (ch1 == ch2) {
					System.out.print(ch1 + " ");
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		String numStr1 = Integer.toString(num1);
		String numStr2 = Integer.toString(num2);

		scanner.close();
		
		if(num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99) {
			occuranceOfDigits(numStr1, numStr2);
		}
		else {
			System.out.println("out of bound!");
		}

	}

}
