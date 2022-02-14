package org.jagan.solutions.az;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;

import org.junit.jupiter.api.Assertions;

public class ZTopologicalSoftwareInstallation {

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
        char[] packages = {'A', 'B', 'C', 'D', 'E', 'F'};
        Graph g = new Graph(packages);
        g.addEdge('A', 'B');
        g.addEdge('A', 'C');
        g.addEdge('B', 'D');
        g.addEdge('B', 'E');
        g.addEdge('C', 'D');
        g.addEdge('D', 'E');
        String output = g.topoSort();
        System.out.println("Output : " + output);
        Assertions.assertEquals(" -> F -> A -> C -> B -> D -> E", output);

        g.addEdge('A', 'F');
        g.addEdge('F', 'E');
        output = g.topoSort();
        System.out.println("Output : " + output);
        Assertions.assertEquals(" -> A -> F -> C -> B -> D -> E", output);

    }

    static class Graph {
        char[] packages;
        List<Integer>[] adjList;

        public Graph(char[] packages) {
            this.packages = packages;
            this.adjList = new LinkedList[packages.length];
            for (int i = 0; i < packages.length; i++) {
                this.adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(char src, char dest) {
            int srcIndex = src - 'A';
            packages[srcIndex] = src;
            int destIndex = dest - 'A';
            packages[destIndex] = dest;
            this.adjList[srcIndex].add(destIndex);
        }

        public String topoSort() {
            StringBuilder bldr = new StringBuilder();

            return bldr.toString();
        }

        public void topoSortDfs(int v, boolean[] visited, Stack<Integer> stack) {

        }
    }
}
