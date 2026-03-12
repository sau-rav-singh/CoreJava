package LeetCode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RangeSum_5 {
    //Given an integer array nums, handle multiple queries of the following type:
    //Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.

    /*
    Time Complexity: O(1)
    Space Complexity: O(1)
     */

    static class NumArray {
        private final int[] prefixSums;

        public NumArray(int[] nums) {
            prefixSums = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                prefixSums[i + 1] = prefixSums[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return prefixSums[right + 1] - prefixSums[left];
        }
    }

    @Test
    public void testStandardRange() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSum_5.NumArray numArray = new NumArray(nums);

        // Sum of indices 0 to 2: (-2 + 0 + 3) = 1
        Assert.assertEquals(numArray.sumRange(0, 2), 1, "Sum of range [0, 2] failed");

        // Sum of indices 2 to 5: (3 + -5 + 2 + -1) = -1
        Assert.assertEquals(numArray.sumRange(2, 5), -1, "Sum of range [2, 5] failed");

        // Sum of indices 0 to 5 (Full Array): -3
        Assert.assertEquals(numArray.sumRange(0, 5), -3, "Sum of full range failed");
    }

    @Test
    public void testSingleElementRange() {
        int[] nums = {1, 10, 100};
        RangeSum_5.NumArray numArray = new NumArray(nums);

        // If left == right, it should return just that element
        Assert.assertEquals(numArray.sumRange(1, 1), 10, "Single element range [1, 1] failed");
        Assert.assertEquals(numArray.sumRange(0, 0), 1, "Single element range [0, 0] failed");
    }

    @Test
    public void testLargeValues() {
        int[] nums = {1000, -1000, 1000};
        RangeSum_5.NumArray numArray = new NumArray(nums);

        // Sum of [0, 1] should be 0
        Assert.assertEquals(numArray.sumRange(0, 1), 0, "Sum of cancelling values failed");
    }
}
