package programs.twopointers;

import org.testng.Assert;

import java.util.Arrays;

/**
 * Move Negatives With Order Maintain
 *
 * Problem Statement:
 * Given an array of integers, move all negative numbers to the beginning of the array
 * while maintaining the relative order of both negative and positive numbers.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 */
public class MoveNegativesWithOrderMaintain {

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        moveNegatives(arr);
        Assert.assertEquals(arr, new int[]{-12, -13, -5, -7, -3, -6, 11, 6, 5});
    }

    /**
     * APPROACH: Modified Insertion (Optimal for order maintenance)
     *
     * Time Complexity: O(N^2)
     * - Worst case shifting elements.
     *
     * Space Complexity: O(1)
     * - In-place operations.
     */
    private static void moveNegatives(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (i != j) {
                    int temp = nums[i];
                    for (int k = i; k > j; k--) {
                        nums[k] = nums[k - 1];
                    }
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}

