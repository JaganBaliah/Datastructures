package org.jagan.solutions.math;

import org.junit.jupiter.api.Assertions;

public class ZPowerOfThree {

	public static void main(String[] args) {
		System.out.println("Is 81 Power of Three : " + Integer.toString(81, 3).matches("^10*$"));
		boolean powerOfThree = isPowerOfThree(81);
		System.out.println("Is 81 Power of Three : " + powerOfThree);
		Assertions.assertTrue(powerOfThree);
	}
	
	public static boolean isPowerOfThree(int n) {

		return false;
	}

}
