package programs.array;

import org.testng.Assert;

/**
 * LeetCode 53: Maximum Subarray
 *
 * Problem Statement:
 * Given an array of integers, find the maximum sum of any contiguous subarray.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 */
public class MaxSumSubArray {

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        Assert.assertEquals(maxSubArrayKadane(arr), 55);
        Assert.assertEquals(maxSubArrayBruteForce(arr), 55);
    }

    /**
     * APPROACH 1: Kadane's Algorithm (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int maxSubArrayKadane(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i : nums) {
            currentSum += i;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N^2)
     * - For each starting position, consider all ending positions.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int maxSubArrayBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        return maxSum;
    }
}
