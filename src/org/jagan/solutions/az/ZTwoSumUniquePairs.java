package org.jagan.solutions.az;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

public class ZTwoSumUniquePairs {

	/*
	 * 
	 * Given an int array nums and an int target, find how many unique pairs in the
	 * array such that their sum is equal to target. Return the number of pairs.
	 * 
	 * Example 1:
	 * Input: nums = [1, 1, 2, 45, 46, 46], target = 47 
	 * Output: 2 
	 * Explanation: 1 + 46 = 47 2 + 45 = 47 
	 *
	 * Example 2:
	 * Input: nums = [1, 1], target = 2 
	 * Output: 1 
	 * Explanation: 1 + 1 = 2 
	 * 
	 * Example 3:
	 * Input: nums = [1, 5, 1, 5], target = 6 
	 * Output: 1 
	 * Explanation: [1, 5] and [5, 1] are considered the same.
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 45, 46, 46};
		System.out.println("Input : " + Arrays.toString(nums));
		int output = uniquePairs(nums, 47);
		System.out.println("Output : " + output);
		Assertions.assertEquals(2, output);

		nums = new int[]{1, 1};
		System.out.println("Input : " + Arrays.toString(nums));
		output = uniquePairs(nums, 2);
		System.out.println("Output : " + uniquePairs(nums, 2));
		Assertions.assertEquals(1, output);
		
		nums = new int[]{1, 5, 1, 5};
		System.out.println("Input : " + Arrays.toString(nums));
		output = uniquePairs(nums, 6);
		System.out.println("Output : " + uniquePairs(nums, 6));
		Assertions.assertEquals(1, output);
	}

	public static int uniquePairs(int[] nums, int target) {
		int count = 0;

		return count;
	}

}
