package org.jagan.solutions.az;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class ZPartitionLabels {

	/*
	 * 
	 * A string S of lowercase letters is given. We want to partition this string
	 * into as many parts as possible so that each letter appears in at most one
	 * part, and return a list of integers representing the size of these parts.
	 * 
	 * Example 1: 
	 * 
	 * Input	: S = "ababcbacadefegdehijhklij" 
	 * Output	: [9,7,8] 
	 * Explanation:
	 * The partition is "ababcbaca", "defegde", "hijhklij". This is a partition so
	 * that each letter appears in at most one part. A partition like
	 * "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less
	 * parts.
	 * 
	 * Note: S will have length in range [1, 500]. S will consist of lowercase
	 * letters ('a' to 'z') only.
	 * 
	 */
	public static void main(String[] args) {
		String input = "ababcbacadefegdehijhklij";
		System.out.println("Input : " + input);
		List<Integer> output = partitionLabels(input);
		System.out.println("Output : " + output);
		Assertions.assertEquals("[9, 7, 8]", Arrays.toString(output.toArray()));
	}

	public static List<Integer> partitionLabels(String input) {
		List<Integer> rtnVal = new ArrayList<>();

		return rtnVal;
	}
}
