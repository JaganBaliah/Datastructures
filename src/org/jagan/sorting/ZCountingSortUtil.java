package org.jagan.sorting;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

public class ZCountingSortUtil {

	public static void main(String[] args) {
		intArr();
		charArr();
	}

	private static void intArr() {
		int[] arr = {12, 11, 12, 13, 7, 5, 6, 7};
		System.out.println(Arrays.toString(arr));
		int len = arr.length;



		System.out.println(Arrays.toString(arr));
		Assertions.assertEquals("[5, 6, 7, 7, 11, 12, 12, 13]", Arrays.toString(arr));
	}

	private static void charArr() {
		char[] arr = {'a', 'l', 'p', 'h', 'a', 'b', 'e', 't'};
		System.out.println(Arrays.toString(arr));
		int len = arr.length;



		System.out.println(Arrays.toString(arr));
		Assertions.assertEquals("[a, a, b, e, h, l, p, t]", Arrays.toString(arr));
	}

}
