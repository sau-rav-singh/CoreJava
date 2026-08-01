package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 238: Product of Array Except Self
 *
 * Problem Statement:
 * Given an integer array nums, return an array answer such that answer[i] is equal to the
 * product of all the elements of nums except nums[i]. You must write an algorithm that runs in O(n)
 * time and without using the division operation.
 *
 * Constraints:
 * - 2 <= nums.length <= 10^5
 * - -30 <= nums[i] <= 30
 * - The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class ProductArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Assert.assertEquals(productExceptSelfOptimal(nums), new int[]{24, 12, 8, 6});
        Assert.assertEquals(productExceptSelfBruteForce(nums), new int[]{24, 12, 8, 6});
    }

    /**
     * APPROACH 1: Prefix and Suffix Products (Optimal)
     *
     * Time Complexity: O(N)
     * - Two passes through the array.
     *
     * Space Complexity: O(1) (excluding output array)
     * - Uses constant extra space (output array doesn't count).
     */
    public static int[] productExceptSelfOptimal(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N^2)
     * - For each element, calculate product of all other elements.
     *
     * Space Complexity: O(1) (excluding output array)
     * - Uses constant extra space.
     */
    public static int[] productExceptSelfBruteForce(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }
}

