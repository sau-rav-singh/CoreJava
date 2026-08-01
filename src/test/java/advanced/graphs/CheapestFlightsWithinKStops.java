package advanced.graphs;

import java.util.*;

public class CheapestFlightsWithinKStops {
    // QUESTION: You are given a graph with n nodes labeled from 0 to n - 1, and an array of flights where
    // flights[i] = [fromi, toi, pricei] indicates that there is a flight from city fromi to city toi with cost pricei.
    // You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
    // If there is no such route, return -1.
    // Example: Input: n = 3, flights = [[0,1,100],[1,2,100],[0,2,500]], src = 0, dst = 2, k = 1
    //          Output: 200
    // Time Complexity: O(n * k)
    // Space Complexity: O(n * k)

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        // Build adjacency list
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int[] flight : flights) {
            graph.get(flight[0]).add(new int[]{flight[1], flight[2]});
        }

        // Priority queue: [cost, city, stops]
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, src, 0});

        // Track minimum cost to reach each city with given stops
        int[][] minCost = new int[n][k + 2];
        for (int[] row : minCost) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        minCost[src][0] = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int cost = current[0];
            int city = current[1];
            int stops = current[2];

            if (city == dst) return cost;
            if (stops > k) continue;

            for (int[] neighbor : graph.get(city)) {
                int nextCity = neighbor[0];
                int price = neighbor[1];
                int newCost = cost + price;

                if (newCost < minCost[nextCity][stops + 1]) {
                    minCost[nextCity][stops + 1] = newCost;
                    pq.offer(new int[]{newCost, nextCity, stops + 1});
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0, dst = 2, k = 1;
        System.out.println(findCheapestPrice(n, flights, src, dst, k)); // Output: 200

        int n2 = 3;
        int[][] flights2 = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src2 = 0, dst2 = 2, k2 = 0;
        System.out.println(findCheapestPrice(n2, flights2, src2, dst2, k2)); // Output: 500
    }
}
