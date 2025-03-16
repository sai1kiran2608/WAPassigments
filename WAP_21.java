//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts a string and finds all the duplicate characters in the given string.
public class WAP_21 {

	public static void findDuplicateCharacters(String str, int hashArr[], int size) {

		for (int i = 0; i < str.length(); i++) {
			hashArr[str.charAt(i)] += 1;
		}

		for (int i = 0; i < size; i++) {
			if (hashArr[i] > 1) {
				System.out.println("The character " + (char) i + " appeared for " + hashArr[i] + " times.");
			}
		}
	}

	public static void main(String[] args) {
		
		int size = 256;
		int hashArr[] = new int[size];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Write a string: ");
		String str = scanner.nextLine();

		scanner.close();

		findDuplicateCharacters(str, hashArr, size);
	}

}