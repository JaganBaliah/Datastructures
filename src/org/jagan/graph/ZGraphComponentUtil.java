package org.jagan.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.Assertions;

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

		System.out.println("\n");
		g.compCount(0);
		System.out.println("Comp counts : " + Arrays.toString(g.component));
		Assertions.assertEquals("[0, 0, 0, 0, 1, 1, 1]", Arrays.toString(g.component));
		System.out.println();
		System.out.println("DFS All Vertex");
		g.dfsAll();

	}

	static class Graph {
		int n;
		LinkedList<Integer>[] adjList;
		int[] component;

		@SuppressWarnings("unchecked")
		Graph(int n) {
			this.n = n;
			this.adjList = new LinkedList[n];
			for (int i = 0; i < n; i++) {
				this.adjList[i] = new LinkedList<>();
			}
			this.component = new int[n];
		}

		public void addEdge(int src, int dest) {
			this.adjList[src].add(dest);
		}

		public void dfs(int v) {
			boolean[] visited = new boolean[n];
			dfsUtil(v, visited);
		}

		public void dfsUtil(int v, boolean[] visited) {
			visited[v] = true;
			System.out.print(" -> " + v);
			for (Integer nV : this.adjList[v]) {
				if (!visited[nV]) dfsUtil(nV, visited);
			}
		}

		public void dfsAll() {
			boolean[] visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (!visited[i]) dfsUtil(i, visited);
			}
		}

		public void compCount(int compCount) {
			boolean[] visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				if (!visited[i]) compCountDfs(i, visited, compCount++);
			}
		}

		private void compCountDfs(int vertex, boolean[] visited, int compCount) {
			this.component[vertex] = compCount;
			visited[vertex] = true;
			for (Integer nV : this.adjList[vertex]) {
				if (!visited[nV]) compCountDfs(nV, visited, compCount);
			}
		}
	}
}
