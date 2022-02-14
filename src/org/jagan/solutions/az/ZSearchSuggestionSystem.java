package org.jagan.solutions.az;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;

public class ZSearchSuggestionSystem {

	/*
	 * Given an array of strings products and a string searchWord. We want to design
	 * a system that suggests at most three product names from products after each
	 * character of searchWord is typed. Suggested products should have common
	 * prefix with the searchWord. If there are more than three products with a
	 * common prefix return the three lexicographically minimums products.
	 * 
	 * Return list of lists of the suggested products after each character of
	 * searchWord is typed.
	 * 
	 * Example 1:
	 * Input: 	products = ["mobile","mouse","moneypot","monitor","mousepad"],
	 * 			searchWord = "mouse" 
	 * Output: [ 	["mobile","moneypot","monitor"], 
	 * 				["mobile","moneypot","monitor"], 
	 * 				["mouse","mousepad"], 
	 * 				["mouse","mousepad"],
	 * 				["mouse","mousepad"] ] 
	 * Explanation: 
	 * products sorted lexicographically = ["mobile","moneypot","monitor","mouse","mousepad"] 
	 * After typing m and mo all products match and we show user ["mobile","moneypot","monitor"] 
	 * After typing mou, mous and mouse the system suggests ["mouse","mousepad"] 
	 * 
	 * Example 2:
	 * Input: products = ["havana"], 
	 * searchWord = "havana" 
	 * Output: [["havana"],["havana"],["havana"],["havana"],["havana"],["havana"]] 
	 * 
	 * Example 3:
	 * Input: products = ["bags","baggage","banner","box","cloths"], 
	 * searchWord = "bags" 
	 * Output: [["baggage","bags","banner"],["baggage","bags","banner"],["baggage","bags"],["bags"]] 
	 * 
	 * Example 4:
	 * Input: products = ["havana"], 
	 * searchWord = "tatiana" 
	 * Output:[[],[],[],[],[],[],[]]
	 */
	public static void main(String[] args) {
		String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
		String searchWord = "mouse";
		List<List<String>> output = suggestedProducts(products, searchWord);
		System.out.println("Suggested Products : " + output);
		Assertions.assertEquals("[[mobile, moneypot, monitor], [mobile, moneypot, monitor], [mouse, mousepad], [mouse, mousepad], [mouse, mousepad]]", output.toString());
		
		System.out.println();
		
		products = new String[]{"havana"};
		searchWord = "havana";
		output = suggestedProducts(products, searchWord);
		System.out.println("Suggested Products : " + output);
		Assertions.assertEquals("[[havana], [havana], [havana], [havana], [havana], [havana]]", output.toString());


		System.out.println();
		
		products = new String[]{"bags","baggage","banner","box","cloths"};
		searchWord = "bags";
		output = suggestedProducts(products, searchWord);
		System.out.println("Suggested Products : " + output);
		Assertions.assertEquals("[[baggage, bags, banner], [baggage, bags, banner], [baggage, bags], [bags]]", output.toString());

		System.out.println();
		
		products = new String[]{"havana"};
		searchWord = "tatiana";
		output = suggestedProducts(products, searchWord);
		System.out.println("Suggested Products : " + output);
		Assertions.assertEquals("[[], [], [], [], [], [], []]", output.toString());

	}

	static class Trie {
        Trie[] sub = new Trie[26];
        LinkedList<String> suggestion = new LinkedList<>();
    }
	
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
    	List<List<String>> rtnVal = new ArrayList();

	    return rtnVal;
    }
}
