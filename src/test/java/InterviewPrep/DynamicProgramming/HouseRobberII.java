package InterviewPrep.DynamicProgramming;

public class HouseRobberII {
    // QUESTION: You are a professional robber planning to rob houses along a street. Each house has a certain
    // amount of money stashed. All houses at this place are arranged in a circle. This means the first house is
    // the neighbor of the last one. Return the maximum amount of money you can rob tonight without alerting the police.
    // Example: Input: nums = [2,3,2]
    //          Output: 3 (rob house 2)
    // Time Complexity: O(n)
    // Space Complexity: O(1)

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

    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        System.out.println(rob(nums1)); // Output: 3

        int[] nums2 = {1, 2, 3, 1};
        System.out.println(rob(nums2)); // Output: 4

        int[] nums3 = {1, 2, 3};
        System.out.println(rob(nums3)); // Output: 3
    }
}
