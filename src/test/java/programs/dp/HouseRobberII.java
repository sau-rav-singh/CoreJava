package programs.dp;

import org.testng.Assert;

/**
 * LeetCode 213: House Robber II
 *
 * Problem Statement:
 * You are a professional robber planning to rob houses along a street. Each house has a certain
 * amount of money stashed. All houses at this place are arranged in a circle. This means the first house is
 * the neighbor of the last one. Return the maximum amount of money you can rob tonight without alerting the police.
 *
 * Constraints:
 * - 1 <= nums.length <= 100
 * - 0 <= nums[i] <= 1000
 */
public class HouseRobberII {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        Assert.assertEquals(rob(nums1), 3);

        int[] nums2 = {1, 2, 3, 1};
        Assert.assertEquals(rob(nums2), 4);

        int[] nums3 = {1, 2, 3};
        Assert.assertEquals(rob(nums3), 3);
    }

    /**
     * APPROACH: Two Pass DP (Optimal)
     *
     * Time Complexity: O(N)
     * - Two passes through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // Rob houses from 0 to n-2 (exclude last house)
        int max1 = robLinear(nums, 0, nums.length - 2);
        // Rob houses from 1 to n-1 (exclude first house)
        int max2 = robLinear(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    private static int robLinear(int[] nums, int start, int end) {
        int prev2 = 0, prev1 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
