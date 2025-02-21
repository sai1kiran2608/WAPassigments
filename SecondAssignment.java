//21-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP to convert the given height in inches to centimeters.
public class SecondAssignment {

	public static float HeightConverterFromInchToCm(float inches) {
		float centimeters = (inches * 2.54f);
		return centimeters;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the height in inches: ");
		int inches = scanner.nextInt();

		scanner.close();

		float result = HeightConverterFromInchToCm(inches);
		System.out.println("\n" + inches + " inch = " + result + " cm.");

	}
}