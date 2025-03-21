//21-03-2025

package com.saikiran.WAPassigments;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group list of products by category without category field.
//Ie. If product is laptop or desktop then “Computer”, if mouse, keyboard or monitor then “Peripheral” and other accessories.
public class WAP_31 {

	public static String prodCategories(String str) {
		switch (str) {
		case "laptop", "desktop":
			return "Computer";
		case "mouse", "keyboard", "monitor":
			return "Peripheral";
		case "printer", "headphones":
			return "Other Accessories";
		default:
			return "Unknown Category";
		}
	}

	public static void main(String[] args) {
		List<String> products = Arrays.asList("laptop", "desktop", "mouse", "keyboard", "monitor", "printer",
				"headphones", "air conditioner");

		Map<Object, List<String>> prodByCategories = products.stream()
				.collect(Collectors.groupingBy(s -> prodCategories(s)));
		System.out.println(prodByCategories);
	}

}
