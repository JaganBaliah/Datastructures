package org.jagan.expression;

import java.util.Scanner;

import org.junit.jupiter.api.Assertions;

public class ZTreeNodeUtil {

	public static void main(String[] args) {
		TreeNode node = populate(new Scanner("- + - 3 2 - 5 4 1"));
		System.out.println(node);

		StringBuilder bldr = null;
		bldr = new StringBuilder();
		traverseLevelOrder(node, bldr);
		Assertions.assertEquals("-+1--3254", bldr.toString(), "Incorrect Level Order...");
		System.out.println("Level Order : " + bldr.toString());
		
		bldr = new StringBuilder();
		traversePreOrder(node, bldr);
		Assertions.assertEquals("-+-32-541", bldr.toString(), "Incorrect Pre Order...");
		System.out.println("Pre Order : " + bldr.toString());
		
		bldr = new StringBuilder();
		traverseInOrder(node, bldr);
		Assertions.assertEquals("3-2+5-4-1", bldr.toString(), "Incorrect In Order...");
		System.out.println("In Order : " + bldr.toString());
		
		bldr = new StringBuilder();
		traversePostOrder(node, bldr);
		Assertions.assertEquals("32-54-+1-", bldr.toString(), "Incorrect Post Order...");
		System.out.println("Post Order : " + bldr.toString());

		int evaluate = evaluate(node);
		Assertions.assertEquals(1, evaluate, "Incorrect evaluated value...");
		System.out.println(evaluate);
	}
	
	public static void traverseLevelOrder(TreeNode root, StringBuilder bldr) {

	}

	private static void traversePreOrder(TreeNode node, StringBuilder bldr) {

	}

	private static void preOrder(TreeNode node, StringBuilder bldr) {

	}

	private static void traverseInOrder(TreeNode node, StringBuilder bldr) {

	}

	private static void inOrder(TreeNode node, StringBuilder bldr) {

	}

	private static void traversePostOrder(TreeNode node, StringBuilder bldr) {

	}

	private static void postOrder(TreeNode node, StringBuilder bldr) {

	}

	public static TreeNode populate(Scanner scanner) {
		return null;
	}

	public static int evaluate(TreeNode node) {
		return 0;
	}

	static class TreeNode {
		String data;
		TreeNode left;
		TreeNode right;
		boolean isLeaf;
		
		TreeNode(String data, boolean isLeaf) {
			this.data = data;
			this.isLeaf = isLeaf;
		}
	}
}
