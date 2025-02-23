//21-02-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts 2 integers and a target. Validate if the sum of two numbers is equal to given target.
public class WAP_1 {

	public static int SumCheck(int integer_1, int integer_2, int target) {
		int sum;
		sum = integer_1 + integer_2;
		if(sum == target) return 1;
		else return 0;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first Integer: ");
		int first_integer = scanner.nextInt();

		System.out.print("Enter second integer: ");
		int second_integer = scanner.nextInt();
		
		System.out.print("Enter Target value: ");
		int target = scanner.nextInt();
		
		scanner.close();
		
		switch(SumCheck(first_integer, second_integer, target)) {
		case 1:
			System.out.println("\nYour integer sums upto the given Target value!");
			break;
			
		case 2:
			System.out.println("Your integers doesn't sum upto given Target value.");
			break;
		}
	}
}