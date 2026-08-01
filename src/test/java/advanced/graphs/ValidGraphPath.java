package advanced.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidGraphPath {
    // QUESTION: There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1.
    // The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi]
    // denotes a bi-directional edge between vertex ui and vertex vi. Every vertex pair is connected by at most one edge,
    // and no vertex has an edge to itself. Return true if there is a valid path from source to destination, or false otherwise.
    // Example: Input: n = 3, edges = [[0,1],[1,2],[2,0]], source = 0, destination = 2
    //          Output: true
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) return true;

        // Build adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        // DFS to find path
        Set<Integer> visited = new HashSet<>();
        return dfs(graph, source, destination, visited);
    }

    private static boolean dfs(Map<Integer, List<Integer>> graph, int current, int destination, Set<Integer> visited) {
        if (current == destination) return true;
        if (visited.contains(current)) return false;

        visited.add(current);

        for (int neighbor : graph.get(current)) {
            if (dfs(graph, neighbor, destination, visited)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}};
        int source = 0, destination = 2;
        System.out.println(validPath(n, edges, source, destination)); // Output: true

        int n2 = 6;
        int[][] edges2 = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int source2 = 0, destination2 = 5;
        System.out.println(validPath(n2, edges2, source2, destination2)); // Output: false
    }
}
