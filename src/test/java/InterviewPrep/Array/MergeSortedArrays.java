package InterviewPrep.Array;

import org.testng.Assert;

/**
 * LeetCode 88: Merge Sorted Array
 *
 * Problem Statement:
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * Constraints:
 * - nums1.length == m + n
 * - nums2.length == n
 * - 0 <= m, n <= 200
 * - 1 <= m + n <= 200
 * - -10^9 <= nums1[i], nums2[j] <= 10^9
 */
public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        merge(nums1_1, 3, new int[]{2, 5, 6}, 3);
        Assert.assertEquals(nums1_1, new int[]{1, 2, 2, 3, 5, 6});

        int[] nums1_2 = {1};
        merge(nums1_2, 1, new int[]{}, 0);
        Assert.assertEquals(nums1_2, new int[]{1});

        int[] nums1_3 = {0};
        merge(nums1_3, 0, new int[]{1}, 1);
        Assert.assertEquals(nums1_3, new int[]{1});
    }

    /**
     * APPROACH: Two Pointers (Backward Merging)
     *
     * Time Complexity: O(M + N)
     * - We iterate backwards through both arrays at most M + N times.
     *
     * Space Complexity: O(1)
     * - Merging is performed completely in-place within the extra space provided at the end of nums1.
     */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null || nums2 == null) {
            return;
        }

        int i = m - 1; // Pointer for valid elements in nums1
        int j = n - 1; // Pointer for elements in nums2
        int k = m + n - 1; // Pointer for the end of the merged array (nums1)

        // Merge from back to front to avoid overwriting elements in nums1
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If any elements remain in nums2, copy them over
        // (Remaining elements in nums1 are already in place)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}