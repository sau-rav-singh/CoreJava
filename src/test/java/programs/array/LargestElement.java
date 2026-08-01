package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode (Various): Find Maximum Element in Array
 *
 * Problem Statement:
 * Given an array of integers, find the largest element in the array.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class LargestElement {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 5};
        Assert.assertEquals(findLargestLinear(arr), 5);
        Assert.assertEquals(findLargestSort(arr), 5);
        Assert.assertEquals(findLargestBruteForce(arr), 5);
    }

    /**
     * APPROACH 1: Linear Scan (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
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

    /**
     * APPROACH 2: Sorting
     *
     * Time Complexity: O(N log N)
     * - Sorting takes O(N log N) time.
     *
     * Space Complexity: O(log N)
     * - Arrays.sort() uses O(log N) auxiliary space for the recursion stack.
     */
    public static int findLargestSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    /**
     * APPROACH 3: Brute Force (Comparing with every element)
     *
     * Time Complexity: O(N^2)
     * - For each element, compare with all other elements.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int findLargestBruteForce(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (int i = 0; i < nums.length; i++) {
            boolean isLargest = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i]) {
                    isLargest = false;
                    break;
                }
            }
            if (isLargest) {
                return nums[i];
            }
        }
        return nums[0];
    }
}

