//21-03-2025

package com.saikiran.WAPassigments;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group list of numbers by their Divisibility (2, 5, or neither)
public class WAP_27 {

	public static boolean isDivisibleBy2(int number) {
		if (number % 2 == 0) {
			return true;
		} else
			return false;
	}

	public static boolean isDivisibleBy5(int number) {
		if (number % 5 == 0) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(34, 23, 45, 56, 78, 89, 5, 10, 15, 20, 35, 56, 78, 32, 41, 53, 42, 17, 19, 23, 37);

		Map<String, List<Integer>> numDiv = numbers.stream()
				.collect(Collectors.groupingBy(num -> isDivisibleBy2(num) ? "Divisible By 2"
						: isDivisibleBy5(num) ? "Divisible By 5" : "Divisible By Neither"));
		System.out.println(numDiv);
	}

}
