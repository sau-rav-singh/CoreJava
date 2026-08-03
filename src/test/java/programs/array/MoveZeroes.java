package programs.array;

import org.testng.Assert;

/**
 * LeetCode 283: Move Zeroes
 * Problem Statement:
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements. Do this in-place.
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -2^31 <= nums[i] <= 2^31 - 1
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroesOptimal(nums1);
        Assert.assertEquals(nums1, new int[]{1, 3, 12, 0, 0});
    }

    /**
     * APPROACH: Two Pointers (Optimal)
     * Time Complexity: O(N)
     * - Single pass through the array.
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static void moveZeroesOptimal(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                if (fast != slow) {
                    int temp = nums[fast];
                    nums[fast] = nums[slow];
                    nums[slow] = temp;
                }
                slow++;
            }
        }
    }

}

