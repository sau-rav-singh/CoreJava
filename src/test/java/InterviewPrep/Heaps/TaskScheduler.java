package InterviewPrep.Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TaskScheduler {
    // QUESTION: Given a characters array tasks, representing the tasks a CPU needs to do, where each letter
    // represents a different task. Tasks could be done in any order. Each task is done in one unit of time.
    // For each unit of time, the CPU could complete either one task or just be idle. However, there is a
    // non-negative integer n that represents the cooldown period between two same tasks. Return the least
    // number of units of times that the CPU will take to finish all the given tasks.
    // Example: Input: tasks = ["A","A","A","B","B","B"], n = 2
    //          Output: 8 (A -> B -> idle -> A -> B -> idle -> A -> B)
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)

    public static int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) return 0;

        // Count frequency of each task
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char task : tasks) {
            frequencyMap.put(task, frequencyMap.getOrDefault(task, 0) + 1);
        }

        // Max heap based on frequency
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(frequencyMap.values());

        int intervals = 0;

        while (!maxHeap.isEmpty()) {
            int cycle = n + 1;
            int tasksExecuted = 0;
            java.util.List<Integer> temp = new java.util.ArrayList<>();

            // Execute tasks in the cycle
            while (cycle-- > 0 && !maxHeap.isEmpty()) {
                int freq = maxHeap.poll();
                if (freq > 1) {
                    temp.add(freq - 1);
                }
                tasksExecuted++;
            }

            // Add remaining tasks back to heap
            maxHeap.addAll(temp);

            // If heap is not empty, we need idle time
            intervals += maxHeap.isEmpty() ? tasksExecuted : n + 1;
        }

        return intervals;
    }

    public static void main(String[] args) {
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(leastInterval(tasks1, 2)); // Output: 8

        char[] tasks2 = {'A', 'A', 'A', 'B', 'B', 'B'};
        System.out.println(leastInterval(tasks2, 0)); // Output: 6
    }
}
