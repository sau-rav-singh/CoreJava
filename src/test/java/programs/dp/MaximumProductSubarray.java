package programs.dp;

import org.testng.Assert;

/**
 * LeetCode 152: Maximum Product Subarray
 *
 * Problem Statement:
 * Given an integer array nums, find the contiguous subarray within an array (containing at least
 * one number) which has the largest product.
 *
 * Constraints:
 * - 1 <= nums.length <= 2 * 10^4
 * - -10 <= nums[i] <= 10
 * - The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductSubarray {

    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        Assert.assertEquals(maxProductOptimal(nums1), 6);
        Assert.assertEquals(maxProductBruteForce(nums1), 6);

        int[] nums2 = {-2, 0, -1};
        Assert.assertEquals(maxProductOptimal(nums2), 0);
    }

    /**
     * APPROACH 1: Track Max and Min (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int maxProductOptimal(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If current number is negative, swap max and min
            if (num < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(num, maxProduct * num);
            minProduct = Math.min(num, minProduct * num);

            result = Math.max(result, maxProduct);
        }

        return result;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N^2)
     * - For each starting position, calculate all subarray products.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int maxProductBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProduct = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}
