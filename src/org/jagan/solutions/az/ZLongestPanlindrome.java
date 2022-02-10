package org.jagan.solutions.az;

import org.junit.jupiter.api.Assertions;

public class ZLongestPanlindrome {

	/*
	 * 
	 * Given a string s, find the longest palindromic substring in s. You may assume
	 * that the maximum length of s is 1000.
	 * 
	 * Example 1:
	 * Input: "babad" Output: "bab" Note: "aba" is also a valid answer. 
	 * 
	 * Example 2:
	 * Input: "cbbd" Output: "bb"
	 * 
	 */
	public static void main(String[] args) {
		String input = "babad";
		String output = findLongestPalindrome(input);
		System.out.println("Longest palindrome for \"" + input + "\" : " + output);
		Assertions.assertEquals("bab", output, "Incorrect longest Palindrome string...");
		input = "cbbd";
		output = findLongestPalindrome(input);
		System.out.println("Longest palindrome for \"" + input + "\" : " + output);
		Assertions.assertEquals("bb", output, "Incorrect longest Palindrome string...");
		input = "abededeba";
		output = findLongestPalindrome(input);
		System.out.println("Longest palindrome for \"" + input + "\" : " + output);
		Assertions.assertEquals("abededeba", output, "Incorrect longest Palindrome string...");
	}

	public static String findLongestPalindrome(String input) {

		return "";
	}

}
