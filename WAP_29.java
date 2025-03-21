//21-03-2025

package com.saikiran.WAPassigments;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group list of numbers by their Ranges
public class WAP_29 {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(23, 45, 67, 89, 90, 12, 21, 23, 32, 34, 43, 45, 34, 56, 54, 65, 76, 87,
				98, 9, 1, 2, 3, 4, 5, 6, 9, 25, 11, 21, 15, 16, 20, 30, 324, 234, 445, 64, 67, 234, 567, 321, 12, 13,
				32, 52, 678, 6383, 839, 7393, 3683);

		Map<String, List<Integer>> numsByRanges = numbers.stream()
				.collect(Collectors.groupingBy(num -> (num >= 1 && num <= 10) ? "1 - 10"
						: (num >= 11 && num <= 20) ? "11 - 20"
								: (num >= 21 && num <= 30) ? "21 - 30"
										: (num >= 31 && num <= 40) ? "31 - 40"
												: (num >= 41 && num <= 50) ? "41 - 50" : "> 50"));
		System.out.println(numsByRanges);
	}

}
