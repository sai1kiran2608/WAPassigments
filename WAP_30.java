//21-03-2025

package com.saikiran.WAPassigments;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group list of numbers by Prime number or not
public class WAP_30 {

	public static boolean isPrime(int number) {
		
		if(number == 1) return false;
		
		int is_prime = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				is_prime = 1;
				break;
			}
		}
		if (is_prime == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
				22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47,
				48, 49, 50);

		Map<Object, List<Integer>> numsByPrime = numbers.stream()
				.collect(Collectors.groupingBy(n -> isPrime(n) ? "Primes" : "Not Primes"));
		System.out.println(numsByPrime);

	}

}
