package org.jagan.graph;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ZGraphComponentUtil {

	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		g.addEdge(4, 5);
		g.addEdge(4, 6);
		g.addEdge(5, 4);
		g.addEdge(5, 6);
		g.addEdge(6, 4);
		g.addEdge(6, 5);

		System.out.println("DFS All Vertex");
		g.dfsAll();

		System.out.println("Assigning comp counts....");
		g.compCount();

		System.out.println("DFS All Vertex");
		g.dfsAll();

	}

	static class Graph {
		int n;
		LinkedList<Integer>[] adjList;
		int[] component;

		@SuppressWarnings("unchecked")
		Graph(int n) {

		}

		public void addEdge(int src, int dest) {

		}

		public void dfs(int v) {

		}

		public void dfsUtil(int v, boolean[] visited) {

		}

		public void dfsAll() {

		}

		public void compCount() {

		}

		private void compCountDfs(int vertex, boolean[] visited, int compCount) {
			
		}
	}
}
