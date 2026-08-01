package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode (Various): Separate Even and Odd Numbers
 *
 * Problem Statement:
 * Given an array of integers, move all even numbers to the left side and odd numbers to the right side.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class SeparateEvenOdd {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        separateEvenOddOptimal(arr1);
        Assert.assertEquals(arr1, new int[]{2, 4, 6, 8, 1, 3, 5, 7, 9});

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        separateEvenOddBruteForce(arr2);
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
    public static void separateEvenOddOptimal(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    /**
     * APPROACH 2: Brute Force (Using extra array)
     *
     * Time Complexity: O(N)
     * - Two passes through the array.
     *
     * Space Complexity: O(N)
     * - Uses extra array for storage.
     */
    public static void separateEvenOddBruteForce(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int[] result = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[index++] = num;
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
    }
}

