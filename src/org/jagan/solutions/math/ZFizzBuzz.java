package org.jagan.solutions.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class ZFizzBuzz {

	/*
	 * Write a program that outputs string representation of numbers from 1 to n.
	 * 
	 * But for multiples of three it should output “Fizz” instead of the number and
	 * for the multiples of five output “Buzz”. For numbers which are multiples of
	 * both three and five output “FizzBuzz”.
	 * 
	 * Example:
	 * 
	 * n = 15,
	 * 
	 * Return: [ "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
	 * "11", "Fizz", "13", "14", "FizzBuzz" ]
	 * 
	 */
	public static void main(String[] args) {
		int input = 15;
		List<String> output = fizzBuzz(input);
		System.out.printf("Output for n = %1s : %2s", input, output);
		Assertions.assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]", output.toString());
	}

	public static List<String> fizzBuzz(int input) {
		List<String> rtnVal = new ArrayList<String>();

		return rtnVal;
	}
}
