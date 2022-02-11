package org.jagan.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class ZBucketSortUtil {
	
	public static void main(String[] args) {
		int[] arr = {12, 11, 12, 13, 7, 5, 6, 7, 4, 1, 3, 8};
		System.out.println(Arrays.toString(arr));
		int len = arr.length;



		System.out.println(Arrays.toString(arr));
		Assertions.assertEquals("[1, 3, 4, 5, 6, 7, 7, 8, 11, 12, 12, 13]", Arrays.toString(arr));
	}

}
