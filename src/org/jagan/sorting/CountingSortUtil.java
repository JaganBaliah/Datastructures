package org.jagan.sorting;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;

public class CountingSortUtil {

	public static void main(String[] args) {
		char[] arr = {'a', 'l', 'p', 'h', 'a', 'b', 'e', 't'};
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(char[] arr) {
		int n = arr.length;
		char[] outputArr = new char[n];
		int[] countArr = new int[256];
		for(int i = 0; i < 256; i++) countArr[i] = 0;
		for(int i = 0; i < n; i++) {
			//++countArr[arr[i]];
			countArr[arr[i]] = countArr[arr[i]] + 1;
		}
		for(int i = 1; i < 256; i++) {
			//countArr[i] += countArr[i - 1];
			countArr[i] = countArr[i] + countArr[i - 1];
		}
		for(int i = n - 1; i >= 0; i--) {
			//outputArr[--countArr[arr[i]]] = arr[i];
			outputArr[countArr[arr[i]] - 1] = arr[i];
			countArr[arr[i]] = countArr[arr[i]] - 1;
		}
		System.out.println(Arrays.toString(outputArr));
	}

	private static void intArr() {
		int[] arr = {12, 11, 12, 13, 7, 5, 6, 7};
		System.out.println(Arrays.toString(arr));
		int len = arr.length;
		int max = arr[0];
		for (int val : arr) {
			if (val > max) max = val;
		}
		int cLen = max + 1;
		int[] cArr = new int[cLen];
		for (int i = 0; i < len; i++) cArr[arr[i]]++;
		for (int i = 1; i < cLen; i++) cArr[i] += cArr[i-1];
		int[] tArr = new int[len];
		for (int i = len - 1; i >= 0; i--) tArr[--cArr[arr[i]]] = arr[i];
		for (int i = 0; i < len; i++) arr[i] = tArr[i];

		System.out.println(Arrays.toString(arr));
		Assertions.assertEquals("[5, 6, 7, 7, 11, 12, 12, 13]", Arrays.toString(arr));
	}

	private static void charArr() {
		char[] arr = {'a', 'l', 'p', 'h', 'a', 'b', 'e', 't'};
		System.out.println(Arrays.toString(arr));
		int len = arr.length;

		int cLen = 26;
		int[] cArr = new int[cLen];
		for (int i = 0; i < len; i++) cArr[arr[i] - 'a']++;
		for (int i = 1; i < cLen; i++) cArr[i] += cArr[i-1];
		char[] tArr = new char[len];
		for (int i = len - 1; i >= 0; i--) tArr[--cArr[arr[i] - 'a']] = arr[i];
		for (int i = 0; i < len; i++) arr[i] = tArr[i];

		System.out.println(Arrays.toString(arr));
		Assertions.assertEquals("[a, a, b, e, h, l, p, t]", Arrays.toString(arr));
	}
}
