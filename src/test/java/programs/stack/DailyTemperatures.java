package programs.stack;

import org.testng.Assert;

import java.util.Stack;

/**
 * LeetCode 739: Daily Temperatures
 *
 * Problem Statement:
 * Given an array of integers temperatures represents the daily temperatures,
 * return an array answer such that answer[i] is the number of days you have to wait
 * after the ith day to get a warmer temperature. If there is no future day for which
 * this is possible, keep answer[i] == 0 instead.
 *
 * Constraints:
 * - 1 <= temperatures.length <= 10^5
 * - 30 <= temperatures[i] <= 100
 */
public class DailyTemperatures {

    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(temperatures);
        Assert.assertEquals(result, new int[]{1, 1, 4, 2, 1, 1, 0, 0});
    }

    /**
     * APPROACH: Monotonic Stack (Optimal)
     *
     * Time Complexity: O(N)
     * - Each element is pushed and popped at most once.
     *
     * Space Complexity: O(N)
     * - Stack storing indices.
     */
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;
            }
            stack.push(i);
        }

        return answer;
    }
}
