//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that prints the magic number of given number.
public class WAP_11 {

	public static boolean isMagicNumber(int num) {
		while (num > 9) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num == 1;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();

		if (isMagicNumber(num)) {
			System.out.println(num + " is a Magic Number!");
		} else {
			System.out.println(num + " is NOT a Magic Number.");
		}
	}

}
