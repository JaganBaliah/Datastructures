package org.jagan.solutions.az;

import org.junit.jupiter.api.Assertions;

public class ZCountSubstringsWithKDistinctChars {

	/*
	 * 
	 * Given a string s and an int k, return an int representing the number of
	 * substrings (not unique) of s with exactly k distinct characters. If the given
	 * string doesn't have k distinct characters, return 0.
	 * 
	 * Example 1:
	 * Input: s = "pqpqs", k = 2
	 * Output: 7 
	 * Explanation: ["pq", "pqp", "pqpq", "qp", "qpq", "pq", "qs"] 
	 * 
	 * Example 2:
	 * Input: s = "aabab", k = 3 
	 * Output: 0 
	 * 
	 * Constraints:
	 * The input string consists of only lowercase English letters [a-z] 0 ≤ k ≤ 26
	 * 
	 */

	public static void main(String[] args) 
	{ 
		String input = "abcbaa";
		int k = 3;
		int output = countkDist(input, k);
		System.out.println("Total substrings with exactly " +
				k + " distinct characters in " + input + " : "
				+ output);
		Assertions.assertEquals(8, output, "Incorrect Distinct Count...");

		input = "pqpqs";
		k = 2;
		output = countkDist(input, k);
		System.out.println("Total substrings with exactly " +
				k + " distinct characters in " + input + " : "
				+ output);
		Assertions.assertEquals(7, output, "Incorrect Distinct Count...");

		input = "aabab";
		k = 3;
		output = countkDist(input, k);
		System.out.println("Total substrings with exactly " +
				k + " distinct characters in " + input + " : "
				+ output);
		Assertions.assertEquals(0, output, "Incorrect Distinct Count...");

		input = "abcbaa";
		k = 3;
		output = countkDist1(input, k);
		System.out.println("Total substrings with exactly " +
				k + " distinct characters in " + input + " : "
				+ output);
		Assertions.assertEquals(0, output, "Incorrect Distinct Count...");

		input = "pqpqsr";
		k = 2;
		output = countkDist1(input, k);
		System.out.println("Total substrings with exactly " +
				k + " distinct characters in " + input + " : "
				+ output);
		Assertions.assertEquals(0, output, "Incorrect Distinct Count...");

		input = "aabab";
		k = 3;
		output = countkDist1(input, k);
		System.out.println("Total substrings with exactly " +
				k + " distinct characters in " + input + " : "
				+ output);
		Assertions.assertEquals(0, output, "Incorrect Distinct Count...");

	} 

	public static int countkDist1(String str, int k) {
		return 0;
	}

	public static int countkDist(String str, int k) {

		return 0;
	}
}
