package programs.dp;

import org.testng.Assert;

/**
 * LeetCode 300: Longest Increasing Subsequence
 *
 * Problem Statement:
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 *
 * Constraints:
 * - 1 <= nums.length <= 2500
 * - -10^4 <= nums[i] <= 10^4
 */
public class LongestIncreasingSubsequence {

    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        Assert.assertEquals(lengthOfLISBinarySearch(nums1), 4);
        Assert.assertEquals(lengthOfLISDP(nums1), 4);
        Assert.assertEquals(lengthOfLISBruteForce(nums1), 4);

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        Assert.assertEquals(lengthOfLISBinarySearch(nums2), 4);
    }

    /**
     * APPROACH 1: Binary Search with Tails Array (Optimal)
     *
     * Time Complexity: O(N log N)
     * - Binary search for each element.
     *
     * Space Complexity: O(N)
     * - Tails array of size n.
     */
    public static int lengthOfLISBinarySearch(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] tails = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            tails[left] = num;
            if (left == size) {
                size++;
            }
        }

        return size;
    }

    /**
     * APPROACH 2: Dynamic Programming
     *
     * Time Complexity: O(N^2)
     * - Nested loops to compare all pairs.
     *
     * Space Complexity: O(N)
     * - DP array of size n.
     */
    public static int lengthOfLISDP(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] dp = new int[nums.length];
        int maxLen = 1;

        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }

    /**
     * APPROACH 3: Brute Force (Recursion)
     *
     * Time Complexity: O(2^N)
     * - Exponential due to include/exclude choices.
     *
     * Space Complexity: O(N)
     * - Recursion stack depth.
     */
    public static int lengthOfLISBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return lisHelper(nums, -1, 0);
    }

    private static int lisHelper(int[] nums, int prevIndex, int currentIndex) {
        if (currentIndex == nums.length) return 0;

        int include = 0;
        if (prevIndex == -1 || nums[currentIndex] > nums[prevIndex]) {
            include = 1 + lisHelper(nums, currentIndex, currentIndex + 1);
        }

        int exclude = lisHelper(nums, prevIndex, currentIndex + 1);

        return Math.max(include, exclude);
    }
}
