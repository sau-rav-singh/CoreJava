package advanced.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CriticalConnections {
    // QUESTION: There are n servers numbered from 0 to n - 1 connected by undirected server-to-server connections
    // forming a network where connections[i] = [a, b] represents a connection between servers a and b.
    // Any server can reach any other server directly or indirectly through the network.
    // A critical connection is a connection that, if removed, will make some servers unable to reach some other server.
    // Return all critical connections in the network in any order.
    // Example: Input: n = 4, connections = [[0,1],[1,2],[2,0],[1,3]]
    //          Output: [[1,3]]
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    private static List<List<Integer>> result;
    private static List<List<Integer>> graph;
    private static int[] disc;
    private static int[] low;
    private static int time;

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        result = new ArrayList<>();
        graph = new ArrayList<>();
        disc = new int[n];
        low = new int[n];
        time = 0;

        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        // Build adjacency list
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (List<Integer> connection : connections) {
            int u = connection.get(0);
            int v = connection.get(1);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // DFS to find bridges
        dfs(0, -1);

        return result;
    }

    private static void dfs(int node, int parent) {
        disc[node] = low[node] = time++;

        for (int neighbor : graph.get(node)) {
            if (neighbor == parent) continue;

            if (disc[neighbor] == -1) {
                dfs(neighbor, node);
                low[node] = Math.min(low[node], low[neighbor]);

                // Check for bridge
                if (low[neighbor] > disc[node]) {
                    result.add(Arrays.asList(node, neighbor));
                }
            } else {
                low[node] = Math.min(low[node], disc[neighbor]);
            }
        }
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> connections = new ArrayList<>();
        connections.add(Arrays.asList(0, 1));
        connections.add(Arrays.asList(1, 2));
        connections.add(Arrays.asList(2, 0));
        connections.add(Arrays.asList(1, 3));

        List<List<Integer>> result = criticalConnections(n, connections);
        System.out.println("Critical connections:");
        for (List<Integer> connection : result) {
            System.out.println(connection);
        }
        // Output: [[1,3]]
    }
}
