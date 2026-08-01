package advanced.graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class NetworkDelayTime {
    // QUESTION: You are given a network of n nodes, labeled from 1 to n. You are given times, a list of travel times
    // as directed edges times[i] = (ui, vi, wi), where wi is the time it takes for a signal to travel from ui to vi.
    // We send a signal from a given node k. Return the minimum time it takes for all the n nodes to receive the signal.
    // If it is impossible for all n nodes to receive the signal, return -1.
    // Example: Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
    //          Output: 2
    // Time Complexity: O((V + E) log V)
    // Space Complexity: O(V + E)

    public static int networkDelayTime(int[][] times, int n, int k) {
        // Build adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] time : times) {
            int from = time[0];
            int to = time[1];
            int weight = time[2];
            graph.get(from).add(new int[]{to, weight});
        }

        // Dijkstra's algorithm
        int[] distances = new int[n + 1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[k] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.offer(new int[]{k, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int dist = current[1];

            if (dist > distances[node]) continue;

            for (int[] neighbor : graph.get(node)) {
                int nextNode = neighbor[0];
                int weight = neighbor[1];
                int newDist = dist + weight;

                if (newDist < distances[nextNode]) {
                    distances[nextNode] = newDist;
                    pq.offer(new int[]{nextNode, newDist});
                }
            }
        }

        // Find maximum distance
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (distances[i] == Integer.MAX_VALUE) return -1;
            maxTime = Math.max(maxTime, distances[i]);
        }

        return maxTime;
    }

    public static void main(String[] args) {
        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n = 4, k = 2;
        System.out.println(networkDelayTime(times, n, k)); // Output: 2
    }
}
