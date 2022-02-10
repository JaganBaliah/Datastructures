package org.jagan.solutions.az;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

import org.jagan.graph.GraphUtil;

public class TopologicalSoftwareInstallation {

    /*
     * Objective: Given a list of software’s which you need to install in a computer.
     * Few software’s has dependency on other software’s in the list, means these software can be installed
     * only when all of its dependent software’s are installed. Write an algorithm to print the sequence in
     * which all the software’s in the list can be installed.
     *
     * Example:
     * Software’s: A B C D E F
     * E depends on B, D
     * D depends on B, C
     * C depends on A
     * B depends on A
     * F no dependency
     *
     * Output: F A B C D E
     *
     *
     *
     *      A --> B --------> E
     *      |      \         ^
     *      |       \       /
     *      |         ---> D        F
     *      |             ^
     *      |            /
     *      ----------> C
     */
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge('A', 'B');
        g.addEdge('A', 'C');
        g.addEdge('B', 'D');
        g.addEdge('B', 'E');
        g.addEdge('C', 'D');
        g.addEdge('D', 'E');

        System.out.println("DFS for 2");
        g.dfs('A');
        System.out.println("DFS All Vertex");
        g.dfsAll();

        System.out.println("Topological Sort");
        g.topoSort();
    }

    static class Graph {
        int n;
        LinkedList<Character>[] adjList;

        @SuppressWarnings("unchecked") Graph(int n) {
            this.n = n;
            this.adjList = new LinkedList[n];
            for (int i = 0; i < n; i++) {
                this.adjList[i] = new LinkedList<Character>();
            }
        }

        public void addEdge(char src, char dest) {
            this.adjList[src - 'A'].add(dest);
        }

        public void dfs(char v) {
            boolean[] visited = new boolean[n];
            dfsUtil(v, visited);
            System.out.println();
        }

        public void dfsUtil(char v, boolean[] visited) {
            visited[v - 'A'] = true;
            System.out.print(" -> " + v);
            ListIterator<Character> listIterator = this.adjList[v - 'A'].listIterator();
            while (listIterator.hasNext()) {
                char next = listIterator.next();
                if (!visited[next - 'A']) {
                    dfsUtil(next, visited);
                }
            }
        }

        public void dfsAll() {
            boolean[] visited = new boolean[n];
            for (char ch = 'A'; ch <= 'F'; ch++) {
                if (!visited[ch - 'A'])
                    dfsUtil(ch, visited);
            }
            System.out.println();
        }

        public void topoSort() {
            boolean[] visited = new boolean[n];
            Stack<Character> stack = new Stack();
            for (char ch = 'A'; ch <= 'F'; ch++) {
                if (!visited[ch - 'A'])
                    topoSortDfs(ch, visited, stack);
            }
            Character[] output = new Character[stack.size()];
            stack.toArray(output);

            for(int i = output.length - 1; i >= 0; i--) {
                System.out.print(" -> " + output[i]);
            }
            System.out.println();
        }

        public void topoSortDfs(char v, boolean[] visited, Stack<Character> stack) {
            visited[v - 'A'] = true;
            //System.out.print(" -> " + v);
            ListIterator<Character> listIterator = this.adjList[v - 'A'].listIterator();
            while (listIterator.hasNext()) {
                char next = listIterator.next();
                if (!visited[next - 'A']) {
                    topoSortDfs(next, visited, stack);
                }
            }
            stack.push(v);
        }
    }
}
