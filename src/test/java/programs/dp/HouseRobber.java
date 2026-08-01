package programs.dp;

import org.testng.Assert;

/**
 * LeetCode 198: House Robber
 *
 * Problem Statement:
 * You are a professional robber planning to rob houses along a street. Each house has a certain
 * amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent
 * houses have security systems connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night. Given an integer array nums representing the amount of money at each
 * house, return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 400
 */
public class HouseRobber {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        Assert.assertEquals(robOptimal(nums1), 4);
        Assert.assertEquals(robDP(nums1), 4);
        Assert.assertEquals(robBruteForce(nums1), 4);

        int[] nums2 = {2, 7, 9, 3, 1};
        Assert.assertEquals(robOptimal(nums2), 12);
    }

    /**
     * APPROACH 1: Constant Space (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int robOptimal(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0;
        int prev1 = 0;

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    /**
     * APPROACH 2: Dynamic Programming with Array
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(N)
     * - Uses DP array of size n.
     */
    public static int robDP(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }

    /**
     * APPROACH 3: Brute Force (Recursion)
     *
     * Time Complexity: O(2^N)
     * - Exponential due to two choices at each house.
     *
     * Space Complexity: O(N)
     * - Recursion stack depth.
     */
    public static int robBruteForce(int[] nums) {
        return robHelper(nums, 0);
    }

    private static int robHelper(int[] nums, int index) {
        if (index >= nums.length) return 0;

        int robCurrent = nums[index] + robHelper(nums, index + 2);
        int skipCurrent = robHelper(nums, index + 1);

        return Math.max(robCurrent, skipCurrent);
    }
}
