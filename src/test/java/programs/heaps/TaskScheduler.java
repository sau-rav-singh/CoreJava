package programs.heaps;

import org.testng.Assert;

import java.util.*;

/**
 * LeetCode 621: Task Scheduler
 *
 * Problem Statement:
 * Given a characters array tasks, representing the tasks a CPU needs to do, where each letter
 * represents a different task. Tasks could be done in any order. Each task is done in one unit of time.
 * For each unit of time, the CPU could complete either one task or just be idle. However, there is a
 * non-negative integer n that represents the cooldown period between two same tasks. Return the least
 * number of units of times that the CPU will take to finish all the given tasks.
 *
 * Constraints:
 * - 1 <= tasks.length <= 10^4
 * - tasks[i] is an uppercase English letter.
 * - 0 <= n <= 100
 */
public class TaskScheduler {

    public static void main(String[] args) {
        char[] tasks1 = {'A', 'A', 'A', 'B', 'B', 'B'};
        Assert.assertEquals(leastIntervalHeap(tasks1, 2), 8);
        Assert.assertEquals(leastIntervalMath(tasks1, 2), 8);

        char[] tasks2 = {'A', 'A', 'A', 'B', 'B', 'B'};
        Assert.assertEquals(leastIntervalHeap(tasks2, 0), 6);
    }

    /**
     * APPROACH 1: Max Heap (Simulation)
     *
     * Time Complexity: O(N log N)
     * - Building frequency map O(N), heap operations O(N log N).
     *
     * Space Complexity: O(N)
     * - Frequency map and heap.
     */
    public static int leastIntervalHeap(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) return 0;

        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char task : tasks) {
            frequencyMap.put(task, frequencyMap.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
        maxHeap.addAll(frequencyMap.values());

        int intervals = 0;

        while (!maxHeap.isEmpty()) {
            int cycle = n + 1;
            int tasksExecuted = 0;
            List<Integer> temp = new ArrayList<>();

            while (cycle-- > 0 && !maxHeap.isEmpty()) {
                int freq = maxHeap.poll();
                if (freq > 1) {
                    temp.add(freq - 1);
                }
                tasksExecuted++;
            }

            maxHeap.addAll(temp);
            intervals += maxHeap.isEmpty() ? tasksExecuted : n + 1;
        }

        return intervals;
    }

    /**
     * APPROACH 2: Mathematical Formula (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass to count frequencies.
     *
     * Space Complexity: O(1)
     * - Fixed size array of 26 for uppercase letters.
     */
    public static int leastIntervalMath(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0) return 0;

        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        Arrays.sort(freq);

        int maxFreq = freq[25];
        int idleTime = (maxFreq - 1) * n;

        for (int i = 24; i >= 0 && idleTime > 0; i--) {
            idleTime -= Math.min(maxFreq - 1, freq[i]);
        }

        idleTime = Math.max(0, idleTime);

        return tasks.length + idleTime;
    }
}
