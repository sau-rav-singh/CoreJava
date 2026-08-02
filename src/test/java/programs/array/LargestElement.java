package programs.array;

import org.testng.Assert;

/**
 * LeetCode (Various): Find Maximum Element in Array
 * <p>
 * Problem Statement:
 * Given an array of integers, find the largest element in the array.
 * <p>
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 5};
        Assert.assertEquals(findLargestLinear(arr), 5);
    }

    /**
     * APPROACH 1: Linear Scan (Optimal)
     * <p>
     * Time Complexity: O(N)
     * - Single pass through the array.
     * <p>
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int findLargestLinear(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max)
                max = i;
        }
        return max;
    }
}

