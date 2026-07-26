package InterviewPrep.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CourseScheduleII {
    // QUESTION: Return the ordering of courses you should take to finish all courses.
    // If it is impossible to finish all courses, return an empty array.
    // Example: Input: numCourses = 4, prerequisites = [[1,0],[2,0],[3,1],[3,2]]
    //          Output: [0,2,1,3] or [0,1,2,3]
    // Time Complexity: O(V + E)
    // Space Complexity: O(V + E)

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjList = new ArrayList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] prereq : prerequisites) {
            adjList.get(prereq[1]).add(prereq[0]);
            inDegree[prereq[0]]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        while (!queue.isEmpty()) {
            int course = queue.poll();
            result[index++] = course;

            for (int neighbor : adjList.get(course)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        return index == numCourses ? result : new int[0];
    }

    public static void main(String[] args) {
        int numCourses1 = 4;
        int[][] prerequisites1 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] result1 = findOrder(numCourses1, prerequisites1);
        System.out.print("Course order: ");
        for (int course : result1) {
            System.out.print(course + " ");
        }
        System.out.println(); // Output: [0, 1, 2, 3] or [0, 2, 1, 3]

        int numCourses2 = 2;
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        int[] result2 = findOrder(numCourses2, prerequisites2);
        System.out.println("Course order (cycle): " + result2.length); // Output: 0
    }
}
