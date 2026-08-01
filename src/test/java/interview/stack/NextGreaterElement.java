package interview.stack;

import java.util.Stack;

public class NextGreaterElement {
    // QUESTION: Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
    // return the next greater number for every element in nums.
    // The next greater number of a number x is the first greater number to its traversing-order next in the array.
    // If it doesn't exist, return -1 for this number.
    // Example: Input: nums = [1,2,1]
    //          Output: [2,-1,2]
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize result with -1
        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

        // Traverse the array twice (circular)
        for (int i = 0; i < 2 * n; i++) {
            int actualIndex = i % n;
            while (!stack.isEmpty() && nums[actualIndex] > nums[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = nums[actualIndex];
            }
            if (i < n) {
                stack.push(actualIndex);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        int[] result1 = nextGreaterElements(nums1);
        System.out.print("Result 1: ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 2 -1 2

        int[] nums2 = {1, 2, 3, 4, 3};
        int[] result2 = nextGreaterElements(nums2);
        System.out.print("Result 2: ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 2 3 4 -1 4
    }
}
