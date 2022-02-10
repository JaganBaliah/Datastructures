package org.jagan.solutions.az;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class ZMergeIntervals {

	/*
	 * 
	 * Given a collection of intervals, merge all overlapping intervals.
	 * 
	 * Example 1:
	 * 
	 * Input: [[1,3],[2,6],[8,10],[15,18]] Output: [[1,6],[8,10],[15,18]]
	 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
	 * 
	 * Example 2:
	 * 
	 * Input: [[1,4],[4,5]] Output: [[1,5]] Explanation: Intervals [1,4] and [4,5]
	 * are considered overlapping. 
	 * 
	 * NOTE: input types have been changed on April 15, 2019. 
	 * Please reset to default code definition to get new method signature.
	 * 
	 */
	public static void main(String[] args) {
		int[][] intervals = new int[][] {
			{1, 3},
			{2, 6},
			{8, 10},
			{15, 18}
		};
		System.out.println("Input : " + Arrays.deepToString(intervals));
		int[][] output = merge(intervals);
		Assertions.assertEquals("[[1, 6], [8, 10], [15, 18]]", Arrays.deepToString(output));
		System.out.println("Output : " + Arrays.deepToString(output));
		
		intervals = new int[][] {
			{1, 4},
			{4, 5}
		};
		System.out.println("Input : " + Arrays.deepToString(intervals));
		output = merge(intervals);
		Assertions.assertEquals("[[1, 5]]", Arrays.deepToString(output));
		System.out.println("Output : " + Arrays.deepToString(output));

		intervals = new int[][] {
				{1, 5},
				{2, 4},
				{6, 9}
		};
		System.out.println("Input : " + Arrays.deepToString(intervals));
		output = merge(intervals);
		Assertions.assertEquals("[[1, 5], [6, 9]]", Arrays.deepToString(output));
		System.out.println("Output : " + Arrays.deepToString(output));
	}
	
	public static int[][] merge(int[][] intervals) {

		return new int[intervals.length][];
	}
	
	
}
