package programs.dp;

public class HouseRobber {
    // QUESTION: You are a professional robber planning to rob houses along a street. Each house has a certain
    // amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent
    // houses have security systems connected and it will automatically contact the police if two adjacent houses
    // were broken into on the same night. Given an integer array nums representing the amount of money at each
    // house, return the maximum amount of money you can rob tonight without alerting the police.
    // Example: Input: nums = [1,2,3,1]
    //          Output: 4 (rob house 1 and 3)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = 0; // max money if we skip previous house
        int prev1 = 0; // max money if we rob previous house

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(rob(nums1)); // Output: 4

        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println(rob(nums2)); // Output: 12
    }
}
