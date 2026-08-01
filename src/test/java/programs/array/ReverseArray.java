package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode (Various): Reverse Array
 *
 * Problem Statement:
 * Given an array of integers, reverse the array in-place.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class ReverseArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        reverseInPlace(array1);
        Assert.assertEquals(array1, new int[]{6, 5, 4, 3, 2, 1});

        int[] array2 = {1, 2, 3, 4, 5, 6};
        reverseBruteForce(array2);
        Assert.assertEquals(array2, new int[]{6, 5, 4, 3, 2, 1});
    }

    /**
     * APPROACH 1: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass from both ends.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static void reverseInPlace(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    /**
     * APPROACH 2: Brute Force (Using extra array)
     *
     * Time Complexity: O(N)
     * - Single pass to copy elements.
     *
     * Space Complexity: O(N)
     * - Uses extra array for storage.
     */
    public static void reverseBruteForce(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int n = array.length;
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = array[n - 1 - i];
        }
        for (int i = 0; i < n; i++) {
            array[i] = reversed[i];
        }
    }
}

