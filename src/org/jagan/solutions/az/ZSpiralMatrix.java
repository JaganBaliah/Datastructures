package org.jagan.solutions.az;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

public class ZSpiralMatrix {

	/*
	 * 
	 * Given a positive integer n, generate a square matrix filled with elements
	 * from 1 to n * n in spiral order.
	 * 
	 * Example:
	 * 
	 * Input: 3 
	 * Output: 
	 * 	[ 
	 * 		[ 1, 2, 3 ], 
	 * 		[ 8, 9, 4 ], 
	 * 		[ 7, 6, 5 ] 
	 * 	]
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("Input : " + 3);
		int[][] matrix = spiralMatrix(3);
		String output = Arrays.deepToString(matrix);
		System.out.println("Output  : " + output);
		Assertions.assertEquals("[[1, 2, 3], [8, 9, 4], [7, 6, 5]]", output);
		
		System.out.println("Input : " + 4);
		matrix = spiralMatrix(4);
		output = Arrays.deepToString(matrix);
		System.out.println("Output  : " + output);
		Assertions.assertEquals("[[1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7]]", output);
	}

	public static int[][] spiralMatrix(int n) {
		int[][] rtnVal = new int[n][n];


		return rtnVal;
	}

}
