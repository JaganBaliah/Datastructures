package org.jagan.solutions.az;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class ZGenerateParantheses {

	/*
	 * 
	 * Given n pairs of parentheses, write a function to generate all combinations
	 * of well-formed parentheses.
	 * 
	 * For example, given n = 3, a solution set is:
	 * 
	 * [ "((()))", 
	 *   "(()())", 
	 *   "(())()", 
	 *   "()(())", 
	 *   "()()()" 
	 * ]
	 * 
	 */
	public static void main(String[] args) {
		String paranthesesCombinations = generateParentheses(3);
		Assertions.assertEquals("[((())), (()()), (())(), ()(()), ()()()]", paranthesesCombinations, "Incorrect Paranthesis combination...");
		System.out.println("Pairs of parantheses for n = 3 : " + paranthesesCombinations);
	}

	private static String generateParentheses(int n) {

		return "";
	}

}
