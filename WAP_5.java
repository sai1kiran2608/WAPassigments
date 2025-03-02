//-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

// WAP that accepts time in minutes and seconds. Then it should also print the time in "XXh YYm ZZs" format.
//Validations:
//1. The value for seconds and minutes must be > = 0 and <= 59. 
//2. Handle invalid data entry with appropriate messages.
public class WAP_5 {

	public static void DisplayTime(int min, int sec) {
		if (min < 0 || min > 59 || sec < 0 || sec > 59) {
			System.out.println("Invalid input! Minutes and seconds must be between 0 and 59.");
			return;
		}

		int totalSeconds = (min * 60) + sec;
		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds % 3600) / 60;
		int seconds = totalSeconds % 60;

		System.out.println(hours + "h " + minutes + "m " + seconds + "s");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter minutes (0-59): ");
		int min = scanner.nextInt();

		System.out.print("Enter seconds (0-59): ");
		int sec = scanner.nextInt();

		scanner.close();

		DisplayTime(min, sec);

	}

}
