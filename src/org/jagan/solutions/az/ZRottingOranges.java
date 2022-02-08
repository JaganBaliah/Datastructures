package org.jagan.solutions.az;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;

public class ZRottingOranges {
	
	/*
	 * In a given grid, each cell can have one of three values:
	 * 
	 * the value 0 representing an empty cell; the value 1 representing a fresh
	 * orange; the value 2 representing a rotten orange. Every minute, any fresh
	 * orange that is adjacent (4-directionally) to a rotten orange becomes rotten.
	 * 
	 * Return the minimum number of minutes that must elapse until no cell has a
	 * fresh orange. If this is impossible, return -1 instead.
	 * 
	 * Example 1:
	 * Input: 
	 * [
	 * 	[2,1,1],
	 * 	[1,1,0],
	 * 	[0,1,1]
	 * ] 
	 * Output: 4 
	 * 
	 * 
	 * Example 2:
	 * Input: 
	 * [
	 * 	[2,1,1],
	 * 	[0,1,1],
	 * 	[1,0,1]
	 * ] 
	 * Output: -1 
	 * Explanation: The orange in the bottom left corner (row 2, column 0) is never rotten,
	 * because rotting only happens 4-directionally.
	 * 
	 * 
	 * Example 3:
	 * 
	 * Input: 
	 * [
	 * 	[0,2]
	 * ] 
	 * Output: 0 
	 * 
	 * Explanation: Since there are already no fresh oranges at minute 0, the answer is just 0.
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		int[][] input = {
				{2, 1, 1},
				{1, 1, 0},
				{0, 1, 1}
		};
		System.out.println("Input : " + Arrays.deepToString(input));
		int output = orangesRotting(input);
		Assertions.assertEquals(4, output, "Incorrect time taken...");
		System.out.println("Time taken in minutes : " + output);

		input = new int[][] {
			{2, 1 ,1},
			{0, 1, 1},
			{1, 0, 1}
		};
		System.out.println("Input : " + Arrays.deepToString(input));
		output = orangesRotting(input);
		Assertions.assertEquals(-1, output, "Incorrect time taken...");
		System.out.println("Time taken in minutes : " + output);

		input = new int[][] {
			{0, 2}
		};
		System.out.println("Input : " + Arrays.deepToString(input));
		output = orangesRotting(input);
		Assertions.assertEquals(0, output, "Incorrect time taken...");
		System.out.println("Time taken in minutes : " + output);
	}
	
	public static int orangesRotting0(int[][] grid) {

		return 0;
	}

	public static int orangesRotting(int[][] grid) {

		return -1;
	}

	static class Point {
		int x;
		int y;
		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
