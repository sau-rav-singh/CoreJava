package programs.array;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 26: Remove Duplicates from Sorted Array
 * Problem Statement:
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums. (Modified here to return the sliced array of unique elements).
 * Constraints:
 * - 1 <= nums.length <= 3 * 10^4
 * - -100 <= nums[i] <= 100
 * - nums is sorted in non-decreasing order.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 4, 5};
        Assert.assertEquals(removeDuplicates(arr), new int[]{1, 2, 3, 4, 5});
    }

    /**
     * APPROACH: Two Pointers (In-Place Deduplication)
     * Time Complexity: O(N)
     * - Iterating through the array takes linear time with respect to the number of elements N.
     * Space Complexity: O(K) where K is the number of unique elements
     * - Auxiliary space is O(1) for the in-place modification, though Arrays.copyOfRange
     *   allocates a new array of size K for the return value.
     */
    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        // Note: The problem states the array is already sorted, but keeping Arrays.sort()
        // ensures safety if unsorted inputs are passed.
        Arrays.sort(arr);

        int j = 0; // Pointer for the last unique element found

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) { // Shifts unique elements forward
                j++;
                arr[j] = arr[i];
            }
        }

        return Arrays.copyOfRange(arr, 0, j + 1);
    }
}