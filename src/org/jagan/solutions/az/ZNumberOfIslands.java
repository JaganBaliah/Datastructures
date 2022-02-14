package org.jagan.solutions.az;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.Assertions;

public class ZNumberOfIslands {

	/*
	 * Given a 2d grid map of '1's (land) and '0's (water), count the number of
	 * islands. An island is surrounded by water and is formed by connecting
	 * adjacent lands horizontally or vertically. You may assume all four edges of
	 * the grid are all surrounded by water.
	 * 
	 * Example 1:
	 * Input: 
	 * 11110 
	 * 11010 
	 * 11000 
	 * 00000
	 * 
	 * Output: 1 
	 * 
	 * 								1
	 * 				1							1
	 * 		1				0			1				1
	 * 	0		1 		0		1	1 		0		0		0
	 * 0 0	   0 0     0	
	 * 	
	 * 
	 * Example 2:
	 * Input: 
	 * 11000 
	 * 11000 
	 * 00100 
	 * 00011
	 * 
	 * Output: 3
	 * 
	 */
	public static void main(String[] args) {
		char[][] input = {
				{'1', '1', '1', '1', '0'},
				{'1', '1', '0',	'1', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		System.out.println("Input : " + Arrays.deepToString(input));
		int output = numIslands(input);
		System.out.println("DFS - Number Of Islands : " + output);
		Assertions.assertEquals(1, output, "DFS Incorrect island count...");

		input = new char[][] {
				{'1', '1', '1', '1', '0'},
				{'1', '1', '0', '1', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		System.out.println("Input : " + Arrays.deepToString(input));
		output = numIslands1(input);
		System.out.println("BFS - Number Of Islands : " + output);
		Assertions.assertEquals(1, output, "BFS Incorrect island count...");

		input = new char[][]{
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0',	'0', '0'},
				{'0', '0', '1', '0', '0'},
				{'0', '0', '0', '1', '1'}
		};
		System.out.println("Input : " + Arrays.deepToString(input));
		output = numIslands(input);
		System.out.println("DFS - Number Of Islands : " + output);
		Assertions.assertEquals(3, output, "DFS Incorrect island count...");

		input = new char[][]{
				{'1', '1', '0', '0', '0'},
				{'1', '1', '0',	'0', '0'},
				{'0', '0', '1', '0', '0'},
				{'0', '0', '0', '1', '1'}
		};
		System.out.println("Input : " + Arrays.deepToString(input));
		output = numIslands1(input);
		System.out.println("BFS - Number Of Islands : " + output);
		Assertions.assertEquals(3, output, "BFS Incorrect island count...");

	}
	
	public static int numIslands(char[][] grid) {
		int count = 0;

		return count;
	}

	public static int numIslands1(char[][] grid) {
		int count = 0;

		return count;
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
