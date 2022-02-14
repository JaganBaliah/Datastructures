package org.jagan.solutions.math;

import org.junit.jupiter.api.Assertions;

public class ZCountPrimes {

	/*
	 * 
	 * Count the number of prime numbers less than a non-negative number, n.
	 * 
	 * Example:
	 * 
	 * Input: 10 Output: 4 
	 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
	 * 
	 */
	public static void main(String[] args) {
		int n = 10;
		int count = countPrimes(n);
		System.out.printf("Count of primes less than n = %1s is %2s", n, count);
		Assertions.assertEquals(4, count);
	}
	
	public static int countPrimes(int n) {
		int count = 0;

		return count;
	}

}
