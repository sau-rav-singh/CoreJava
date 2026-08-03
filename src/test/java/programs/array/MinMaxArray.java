package programs.array;

import org.testng.Assert;

/**
 * LeetCode (Various): Find Minimum and Maximum in Array
 * <p>
 * Problem Statement:
 * Given an array of integers, find both the minimum and maximum elements in the array.
 * <p>
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class MinMaxArray {

    public static void main(String[] args) {
        int[] arr = {12, 15, 7, 19, 3, 8};
        int[] result = findMinMaxOptimal(arr);
        Assert.assertEquals(result[0], 3);
        Assert.assertEquals(result[1], 19);

        result = findMinMaxLinear(arr);
        Assert.assertEquals(result[0], 3);
        Assert.assertEquals(result[1], 19);
    }

    /**
     * APPROACH 1: Optimal Comparison (Pair Comparison)
     * <p>
     * Time Complexity: O(N)
     * - Processes elements in pairs, reducing total comparisons from 2N to 1.5N.
     * <p>
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int[] findMinMaxOptimal(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min, max;
        int i;
        int n = arr.length;

        if (n % 2 == 0) {
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        } else {
            min = max = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            int num1 = arr[i];
            int num2 = arr[i + 1];

            if (num1 < num2) {
                min = Math.min(min, num1);
                max = Math.max(max, num2);
            } else {
                min = Math.min(min, num2);
                max = Math.max(max, num1);
            }
            i += 2;
        }
        return new int[]{min, max};
    }

    /**
     * APPROACH 2: Linear Scan
     * <p>
     * Time Complexity: O(N)
     * - Single pass through the array.
     * <p>
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int[] findMinMaxLinear(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return new int[]{min, max};
    }
}
