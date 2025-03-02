//02-03-2025

package com.saikiran.WAPassigments;

import java.util.Scanner;

//WAP that accepts two strings and prints the string in Upper case, Lower case and Camel case without spaces without using the built-in methods.
public class WAP_22 {
	
	public static String toUpperCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Enter a string: ");
    	String str = scanner.nextLine();
    	
    	scanner.close();
    	
    	System.out.println(toUpperCase(str));
    	System.out.println(toLowerCase(str));
    }

}
