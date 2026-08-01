package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 977: Squares of a Sorted Array
 *
 * Problem Statement:
 * Given a sorted array of integers (may contain negative numbers), return an array
 * of the squares of each number sorted in non-decreasing order.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums is sorted in non-decreasing order.
 */
public class SortedSquares {

    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        Assert.assertEquals(sortedSquaresTwoPointer(nums), new int[]{4, 9, 9, 49, 121});
        Assert.assertEquals(sortedSquaresBruteForce(nums), new int[]{4, 9, 9, 49, 121});
    }

    /**
     * APPROACH 1: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass from both ends.
     *
     * Space Complexity: O(N)
     * - Uses extra array for result.
     */
    public static int[] sortedSquaresTwoPointer(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        return result;
    }

    /**
     * APPROACH 2: Brute Force (Square and Sort)
     *
     * Time Complexity: O(N log N)
     * - Squaring takes O(N), sorting takes O(N log N).
     *
     * Space Complexity: O(N)
     * - Uses extra array for result.
     */
    public static int[] sortedSquaresBruteForce(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = nums[i] * nums[i];
        }
        Arrays.sort(result);
        return result;
    }
}


