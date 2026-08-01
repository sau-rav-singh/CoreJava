package programs.stack;

import org.testng.Assert;

import java.util.Stack;

/**
 * LeetCode 503: Next Greater Element II
 *
 * Problem Statement:
 * Given a circular integer array nums (i.e., the next element of nums[nums.length - 1] is nums[0]),
 * return the next greater number for every element in nums.
 * The next greater number of a number x is the first greater number to its traversing-order next in the array.
 * If it doesn't exist, return -1 for this number.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - 0 <= nums[i] <= 10^9
 */
public class NextGreaterElement {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 1};
        int[] result1 = nextGreaterElements(nums1);
        Assert.assertEquals(result1, new int[]{2, -1, 2});

        int[] nums2 = {1, 2, 3, 4, 3};
        int[] result2 = nextGreaterElements(nums2);
        Assert.assertEquals(result2, new int[]{2, 3, 4, -1, 4});
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
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            result[i] = -1;
        }

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
}
