//21-03-2025

package com.saikiran.WAPassigments;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group list of strings by the vowel count.
public class WAP_28 {

	public static boolean isVowel(char ch) {
		switch (ch) {
		case 'a':
			return true;
		case 'e':
			return true;
		case 'i':
			return true;
		case 'o':
			return true;
		case 'u':
			return true;
		case 'A':
			return true;
		case 'E':
			return true;
		case 'I':
			return true;
		case 'O':
			return true;
		case 'U':
			return true;
		default:
			return false;
		}
	}

	public static int vowelCount(String str) {
		int count = 0;

		for (char ch : str.toCharArray()) {
			if (isVowel(ch)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("Hyderabad", "Mumbai", "Bengaluru", "Chennai", "Pune", "Delhi", "Guwahati",
				"Noida", "Kurukshetra", "Vishakapatnam");

		Map<Object, List<String>> stringsByVowelCount = strings.stream()
				.collect(Collectors.groupingBy(str -> vowelCount(str)));
		System.out.println(stringsByVowelCount);

	}

}
