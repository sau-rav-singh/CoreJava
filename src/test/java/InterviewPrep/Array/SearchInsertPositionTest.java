package InterviewPrep.Array;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * LeetCode 35: Search Insert Position
 *
 * Problem Statement:
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 * - nums contains distinct values sorted in ascending order.
 * - -10^4 <= target <= 10^4
 */
public class SearchInsertPositionTest {

    /**
     * APPROACH 1: Linear Search
     *
     * Time Complexity: O(N)
     * - Iterates through the array elements sequentially.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public int searchInsert(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return len;
    }

    /**
     * APPROACH 2: Binary Search (Optimal Time)
     *
     * Time Complexity: O(log N)
     * - Halves the search space in each iteration.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public int searchInsertBinary(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    @Test
    public void testSearchInsertAllCases() {
        // Example 1
        assertEquals(searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
        assertEquals(searchInsertBinary(new int[]{1, 3, 5, 6}, 5), 2);

        // Example 2
        assertEquals(searchInsert(new int[]{1, 3, 5, 6}, 2), 1);
        assertEquals(searchInsertBinary(new int[]{1, 3, 5, 6}, 2), 1);

        // Example 3
        assertEquals(searchInsert(new int[]{1, 3, 5, 6}, 7), 4);
        assertEquals(searchInsertBinary(new int[]{1, 3, 5, 6}, 7), 4);

        // Example 4
        assertEquals(searchInsert(new int[]{1, 3, 5, 6}, 0), 0);
        assertEquals(searchInsertBinary(new int[]{1, 3, 5, 6}, 0), 0);

        // Example 5
        assertEquals(searchInsert(new int[]{1}, 0), 0);
        assertEquals(searchInsertBinary(new int[]{1}, 0), 0);

        // Example 6
        assertEquals(searchInsert(new int[]{1}, 2), 1);
        assertEquals(searchInsertBinary(new int[]{1}, 2), 1);

        // Example 7
        assertEquals(searchInsert(new int[]{1, 2, 3, 4, 5}, 3), 2);
        assertEquals(searchInsertBinary(new int[]{1, 2, 3, 4, 5}, 3), 2);

        // Example 8
        assertEquals(searchInsert(new int[]{1, 2, 3, 4, 5}, 6), 5);
        assertEquals(searchInsertBinary(new int[]{1, 2, 3, 4, 5}, 6), 5);

        // Example 9
        assertEquals(searchInsert(new int[]{1, 2, 3, 4, 5}, 0), 0);
        assertEquals(searchInsertBinary(new int[]{1, 2, 3, 4, 5}, 0), 0);
    }
}