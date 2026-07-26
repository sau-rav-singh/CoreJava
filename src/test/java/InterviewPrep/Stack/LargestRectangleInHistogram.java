package InterviewPrep.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    // QUESTION: Given an array of integers heights representing the histogram's bar height
    // where the width of each bar is 1, return the area of the largest rectangle in the histogram.
    // Example: Input: heights = [2,1,5,6,2,3]
    //          Output: 10
    // Time Complexity: O(n)
    // Space Complexity: O(n)

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

    public static void main(String[] args) {
        int[] heights1 = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights1)); // Output: 10

        int[] heights2 = {2, 4};
        System.out.println(largestRectangleArea(heights2)); // Output: 4
    }
}
