package org.jagan.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;

public class GraphComponentUtil {

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
			this.n = n;
			this.adjList = new LinkedList[n];
			this.component = new int[n];
			for(int i = 0 ; i < n; i++) this.adjList[i] = new LinkedList<Integer>();
		}

		public void addEdge(int src, int dest) {
			this.adjList[src].add(dest);
		}

		public void dfs(int v) {
			boolean[] visited = new boolean[n];
			dfsUtil(v, visited);
			System.out.println();
		}

		public void dfsUtil(int v, boolean[] visited) {
			visited[v] = true;
			System.out.print(" -> " + v + "[" + this.component[v] + "]");
			ListIterator<Integer> listIterator = this.adjList[v].listIterator();
			while(listIterator.hasNext()) {
				int next = listIterator.next();
				if(!visited[next]) {
					dfsUtil(next, visited);
				}
			}
		}

		public void dfsAll() {
			boolean[] visited = new boolean[n];
			for(int i = 0 ; i < n; i++) {
				if(!visited[i])	dfsUtil(i, visited);
			}
			System.out.println();
		}

		public void compCount() {
			boolean[] visited = new boolean[n];
			int count = 0;
			for (int i = 0; i < n; i++) {
				if(!visited[i]) compCountDfs(i, visited, count++);
			}
			return;
		}

		private void compCountDfs(int vertex, boolean[] visited, int compCount) {
			component[vertex] = compCount;
			visited[vertex] = true;
			List<Integer> adjList = this.adjList[vertex];
			for (Integer adjVertex : adjList) {
				if (!visited[adjVertex]) compCountDfs(adjVertex, visited, compCount);
			}
		}
	}
}
