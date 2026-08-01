package programs.searching;

import org.testng.Assert;

import java.util.Arrays;

/**
 * Binary Search
 *
 * Problem Statement:
 * Implement binary search to find a target element in a sorted array.
 * Return the index if found, otherwise return -1.
 *
 * Constraints:
 * - 1 <= arr.length <= 10^4
 * - -10^4 <= arr[i] <= 10^4
 * - arr is sorted in ascending order.
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 7, 9};
        Assert.assertEquals(binarySearch(arr, 7), 3);
        Assert.assertEquals(binarySearch(arr, 8), -1);
    }

    /**
     * APPROACH 1: Iterative Binary Search (Optimal)
     *
     * Time Complexity: O(log N)
     * - Halving the search space each iteration.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    /**
     * APPROACH 2: Recursive Binary Search
     *
     * Time Complexity: O(log N)
     * - Halving the search space each recursion.
     *
     * Space Complexity: O(log N)
     * - Recursion stack depth.
     */
    static int binarySearchRecursive(int[] arr, int num) {
        return binarySearchHelper(arr, num, 0, arr.length - 1);
    }

    private static int binarySearchHelper(int[] arr, int num, int left, int right) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == num) {
            return mid;
        } else if (arr[mid] > num) {
            return binarySearchHelper(arr, num, left, mid - 1);
        } else {
            return binarySearchHelper(arr, num, mid + 1, right);
        }
    }

    /**
     * APPROACH 3: Linear Search (Brute Force)
     *
     * Time Complexity: O(N)
     * - Scanning through the entire array.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
