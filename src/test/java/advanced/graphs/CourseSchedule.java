package advanced.graphs;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
    // QUESTION: There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
    // You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take
    // course bi first if you want to take course ai. Return true if you can finish all courses, otherwise false.
    // Example: Input: numCourses = 2, prerequisites = [[1,0]]
    //          Output: true
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] visited = new int[numCourses]; // 0 = unvisited, 1 = visiting, 2 = visited

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adjList.get(prereq[1]).add(prereq[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, adjList, visited)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasCycle(int node, List<List<Integer>> adjList, int[] visited) {
        if (visited[node] == 1) return true; // Cycle detected
        if (visited[node] == 2) return false; // Already processed

        visited[node] = 1; // Mark as visiting

        for (int neighbor : adjList.get(node)) {
            if (hasCycle(neighbor, adjList, visited)) {
                return true;
            }
        }

        visited[node] = 2; // Mark as visited
        return false;
    }

    public static void main(String[] args) {
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        System.out.println(canFinish(numCourses1, prerequisites1)); // Output: true

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println(canFinish(numCourses2, prerequisites2)); // Output: false
    }
}
