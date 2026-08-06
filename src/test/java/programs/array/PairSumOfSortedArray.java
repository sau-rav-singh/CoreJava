package programs.array;

import org.testng.Assert;

/**
 * LeetCode 167: Two Sum II - Input Array Is Sorted
 * Problem Statement:
 * Given a sorted array of integers and a target sum, find if there exists a pair of elements
 * in the array that sum to the target. Return the pair if found.
 * Constraints:
 * - 2 <= numbers.length <= 3 * 10^4
 * - -1000 <= numbers[i] <= 1000
 * - numbers is sorted in non-decreasing order.
 * - -1000 <= target <= 1000
 */
public class PairSumOfSortedArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Assert.assertEquals(targetSumTwoPointer(arr, 8), new int[]{2, 6});
        Assert.assertEquals(targetSumTwoPointer(arr, 5), new int[]{2, 3});
        Assert.assertEquals(targetSumBruteForce(arr, 8), new int[]{2, 6});
    }

    /**
     * APPROACH 1: Two Pointers (Optimal for sorted arrays)
     * Time Complexity: O(N)
     * - Single pass from both ends.
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int[] targetSumTwoPointer(int[] arr, int targetSum) {
        if (arr == null || arr.length < 2) {
            return new int[]{-1, -1};
        }
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == targetSum) {
                return new int[]{arr[i], arr[j]};
            } else if (sum < targetSum) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }

    /**
     * APPROACH 2: Brute Force
     * Time Complexity: O(N^2)
     * - Checks every pair of elements.
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int[] targetSumBruteForce(int[] arr, int targetSum) {
        if (arr == null || arr.length < 2) {
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

