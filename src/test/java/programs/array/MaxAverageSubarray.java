package programs.array;

import org.testng.Assert;

/**
 * LeetCode 643: Maximum Average Subarray I
 *
 * Problem Statement:
 * Given an array of integers and a number k, find the contiguous subarray of length k
 * that has the maximum average value and return that average.
 *
 * Constraints:
 * - 1 <= k <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 */
public class MaxAverageSubarray {

    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        Assert.assertEquals(getMaxAverageSlidingWindow(arr, 4), 12.75);
        Assert.assertEquals(getMaxAverageBruteForce(arr, 4), 12.75);
    }

    /**
     * APPROACH 1: Sliding Window (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array after computing the initial window sum.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static double getMaxAverageSlidingWindow(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Invalid input");
        }
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        double maxWindowSum = currentSum;
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum + arr[i] - arr[i - k];
            maxWindowSum = Math.max(maxWindowSum, currentSum);
        }
        return maxWindowSum / k;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N * K)
     * - For each starting position, sum K elements.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static double getMaxAverageBruteForce(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Invalid input");
        }
        double maxSum = Double.NEGATIVE_INFINITY;
        for (int i = 0; i <= arr.length - k; i++) {
            double currentSum = 0;
            for (int j = i; j < i + k; j++) {
                currentSum += arr[j];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum / k;
    }
}

