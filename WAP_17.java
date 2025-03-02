//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Random;
import java.util.Scanner;

//WAP that accepts number of elements (positive integer) and generates array with size of given number and fills all values with random numbers within 100.
//Hint: Use Random random = new Random();
//randomNum = random.nextInt(100);
public class WAP_17 {
	
	public static void fillArray(int arr[], int size) {
		
		Random random = new Random();
		
		for(int i = 0; i < size; i++) {
			arr[i] = random.nextInt(100);
		}
	}
	
	public static void printArray(int arr[], int size) {
		
		for(int i = 0; i < size; ++i) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		System.out.println();
		
		scanner.close();
		
		int arr[] = new int[size];
		
		if(size < 100) {
			fillArray(arr, size);
			printArray(arr, size);
		} else {
			System.out.println("Out of bound.");
		}
		
	}

}
