package programs.array;

import org.testng.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 217: Contains Duplicate
 *
 * Problem Statement:
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^9 <= nums[i] <= 10^9
 */
public class ContainsDuplicate {

    public static void main(String[] args) {
        Assert.assertTrue(containsDuplicateWithSort(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(containsDuplicate(new int[]{1, 2, 3, 4}));
        Assert.assertFalse(containsDuplicateBruteForce(new int[]{1, 2, 3, 4}));
    }

    /**
     * APPROACH 1: Sorting (In-Place)
     *
     * Time Complexity: O(N log N)
     * - Arrays.sort(int[]) uses Dual-Pivot Quicksort.
     * - Sorting takes O(N log N) on average.
     * - Scanning adjacent elements takes O(N).
     *
     * Space Complexity: O(log N)
     * - Auxiliary space is O(log N) due to the recursion stack used by Dual-Pivot Quicksort.
     * - Note: The array is sorted in-place (the input array is mutated).
     */
    public static boolean containsDuplicateWithSort(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * APPROACH 2: HashSet (Optimal Time)
     *
     * Time Complexity: O(N)
     * - Inserting into and querying a HashSet takes O(1) time on average.
     * - Iterating through the array takes at most N steps.
     *
     * Space Complexity: O(N)
     * - In the worst case (when all elements are distinct), the HashSet stores N integers.
     */
    public static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        Set<Integer> dupeFilter = new HashSet<>();
        for (int i : nums) {
            if (!dupeFilter.add(i)) {
                return true;
            }
        }
        return false;
    }

    /**
     * APPROACH 3: Brute Force (Nested Loops)
     *
     * Time Complexity: O(N^2)
     * - Checks every unique pair (N * (N - 1) / 2 comparisons in the worst case).
     *
     * Space Complexity: O(1)
     * - Uses auxiliary constant space only; does not mutate the original array.
     */
    public static boolean containsDuplicateBruteForce(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}