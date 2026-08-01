package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 283: Move Zeroes
 *
 * Problem Statement:
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements. Do this in-place.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -2^31 <= nums[i] <= 2^31 - 1
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroesOptimal(nums1);
        Assert.assertEquals(nums1, new int[]{1, 3, 12, 0, 0});

        int[] nums2 = {0, 1, 0, 3, 12};
        moveZeroesBruteForce(nums2);
        Assert.assertEquals(nums2, new int[]{1, 3, 12, 0, 0});
    }

    /**
     * APPROACH 1: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static void moveZeroesOptimal(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                if (fast != slow) {
                    int temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = temp;
                }
                slow++;
            }
        }
    }

    /**
     * APPROACH 2: Brute Force (Shift non-zero elements)
     *
     * Time Complexity: O(N^2)
     * - For each zero, shift all subsequent elements.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static void moveZeroesBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    nums[j - 1] = nums[j];
                }
                nums[n - 1] = 0;
                n--;
                i--;
            }
        }
    }
}

