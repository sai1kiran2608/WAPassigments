//23-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts time in seconds. Then it should print the time in "XXh YYm ZZs" format.
//Hint: 1 hour = 60 minutes = 3600 seconds
public class WAP_4 {

	public static void DisplayTime(int seconds) {

		int hours = seconds / 3600;
		seconds = seconds % 3600;
		int minutes = seconds / 60;
		seconds = seconds % 60;

		System.out.println("\n" + hours + " Hrs : " + minutes + " Mins : " + seconds + " sec");

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the time in seconds: ");
		int seconds = scanner.nextInt();

		scanner.close();

		DisplayTime(seconds);

	}

}
