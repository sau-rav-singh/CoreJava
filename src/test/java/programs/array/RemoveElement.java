package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 27: Remove Element
 *
 * Problem Statement:
 * Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 * Constraints:
 * - 0 <= nums.length <= 100
 * - 0 <= nums[i] <= 50
 * - 0 <= val <= 100
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        Assert.assertEquals(removeElementOptimal(nums1, 3), 2);

        int[] nums2 = {3, 2, 2, 3};
        Assert.assertEquals(removeElementBruteForce(nums2, 3), 2);
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
    public static int removeElementOptimal(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    /**
     * APPROACH 2: Brute Force (Shift elements)
     *
     * Time Complexity: O(N^2)
     * - For each occurrence of val, shift all subsequent elements.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int removeElementBruteForce(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}

