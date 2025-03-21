//21-03-2025

package com.saikiran.WAPassigments;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//WAP to group list of strings by Vowel or Consonant
public class WAP_26 {
	
	public static boolean isVowel(char ch) {
		switch(ch) {
		case 'a': return true;
		case 'e': return true;
		case 'i': return true;
		case 'o': return true;
		case 'u': return true;
		case 'A': return true;
		case 'E': return true;
		case 'I': return true;
		case 'O': return true;
		case 'U': return true;
		default: return false;
		}
	}
	
	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("saikiran", "names", "people", "hyderabad", "telangana", "india", "ireland", 
				"end", "string", "university", "an", "physics", "mathematics", "electronics", "china", "overflow");
		
		Map<Object, List<String>> stringsByVowelsConsonants = strings.stream()
				.collect(Collectors.groupingBy(string -> isVowel(string.charAt(0)) ? "Vowels" : "Consonants"));
		System.out.println(stringsByVowelsConsonants);
		
	}

}
