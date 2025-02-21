//21-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP to convert the given height in feet and inches to centimeters.
public class ThirdAssignment {

	public static float HeightConverterFromFeetAndInchToCm(int feet, int inch){
		float centimeters = (feet * 30.48f) + (inch * 2.54f);
		return centimeters;
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Height in Feet and Inches seperately. \nFeet: ");
		int feet = scanner.nextInt();
		
		System.out.print("Inch: ");
		int inch = scanner.nextInt();
		
		scanner.close();
		
		float result = HeightConverterFromFeetAndInchToCm(feet, inch);
		System.out.println("\n" + feet + " feet " + inch + " inches = " + result + " cm.");
	}
}