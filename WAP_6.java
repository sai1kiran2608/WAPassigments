//23-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts a number and prints the given number in word form.
public class WAP_6 {

	public static void DisplayNumsInWords(int number) {

		String[] words = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String NumStr = Integer.toString(number);
		for (char ch : NumStr.toCharArray()) {
			System.out.print(words[ch - '0'] + " ");
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int number = scanner.nextInt();
		scanner.close();

		DisplayNumsInWords(number);

	}

}
