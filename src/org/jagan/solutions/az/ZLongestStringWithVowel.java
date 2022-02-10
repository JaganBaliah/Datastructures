package org.jagan.solutions.az;

import org.junit.jupiter.api.Assertions;

public class ZLongestStringWithVowel {

	/*
	 * You are given with a string . Your task is to remove at most two substrings of
	 * any length from the given string such that the remaining string contains
	 * vowels('a','e','i','o','u') only. Your aim is the maximize the length of the
	 * remaining string. Output the length of remaining string after removal of
	 * at most two substrings. 
	 * NOTE: The answer may be 0, i.e. removing the entire string.
	 * 
	 * Sample Input 2 
	 * earthproblem 
	 * letsgosomewhere 
	 * Sample Output 
	 * 3 
	 * 2
	 * 
	 * 
	 */
	public static void main(String[] args) {

		String input = "earthproblem";
		int output = longestString(input);
		Assertions.assertEquals(3, output);
		System.out.println("Output : " + output);
		input = "letsgosomewhere";
		output = longestString(input);
		Assertions.assertEquals(2, output);
		System.out.println("Output : " + longestString(input));
	}

	
	public static int longestString(String s){

		return 0;
	}
}
