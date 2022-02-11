package org.jagan.sorting;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

public class ZRadixSortUtil {
	
	public static void main(String[] args) {
		int[] arr = {12, 11, 12, 13, 7, 5, 6, 7};
		System.out.println(Arrays.toString(arr));
		int len = arr.length;



		System.out.println(Arrays.toString(arr));
		Assertions.assertEquals("[5, 6, 7, 7, 11, 12, 12, 13]", Arrays.toString(arr));
	}


}
