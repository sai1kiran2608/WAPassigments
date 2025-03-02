//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts a string and calculates total number of symbols in the given string.
public class WAP_25 {

	public static int countSymbols(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch == ' '))) {
                count++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = scanner.nextLine();
		
		scanner.close();
		
		System.out.println("The No.of symbols in the given string is : " + countSymbols(str));
		
	}
	
}
