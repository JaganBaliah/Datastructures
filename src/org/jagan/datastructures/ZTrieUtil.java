package org.jagan.datastructures;

public class ZTrieUtil {

	public static void main(String[] args) {
		//String[] keys = new String[] {"apple", "ball", "cat", "apply", "bat", "batch"};
		String[] keys = new String[] {"ball", "bat"};
		TrieNode root = new TrieNode();
		insert(root, keys);
		boolean found = false;
		
		found = search(root, "bat");
		System.out.println("bat :" + found);
		found = search(root, "ball");
		System.out.println("ball :" + found);
		found = search(root, "bal");
		System.out.println("bal :" + found);
		
	}
	
	public static void insert(TrieNode root, String[] keys) {


	}

	private static boolean search(TrieNode root, String string) {

		return false;
	}
	
	static class TrieNode {

		TrieNode() {

		}
	}
	
}
