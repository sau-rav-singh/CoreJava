package programs.stack;

import org.testng.Assert;

import java.util.Stack;

/**
 * LeetCode 84: Largest Rectangle in Histogram
 *
 * Problem Statement:
 * Given an array of integers heights representing the histogram's bar height
 * where the width of each bar is 1, return the area of the largest rectangle in the histogram.
 *
 * Constraints:
 * - 1 <= heights.length <= 10^5
 * - 0 <= heights[i] <= 10^4
 */
public class LargestRectangleInHistogram {

    public static void main(String[] args) {
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        Assert.assertEquals(largestRectangleArea(heights1), 10);

        int[] heights2 = {2, 4};
        Assert.assertEquals(largestRectangleArea(heights2), 4);
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
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}
