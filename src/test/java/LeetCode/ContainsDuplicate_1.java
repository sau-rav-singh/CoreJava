package LeetCode;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_1 {

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */

    public static void main(String[] args) {
        Assert.assertTrue(containsDuplicate(new int[]{1, 2, 3, 1}));
        Assert.assertFalse(containsDuplicate(new int[]{1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> dupeFilter = new HashSet<>();
        for (int i : nums) {
            if (!dupeFilter.add(i)) {
                return true;
            }
        }
        return false;
    }
}
