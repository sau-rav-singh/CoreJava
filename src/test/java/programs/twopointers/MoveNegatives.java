package programs.twopointers;

import org.testng.Assert;

/**
 * Move Negatives to Beginning
 *
 * Problem Statement:
 * Given an array of integers, move all negative numbers to the beginning of the array
 * while maintaining the relative order among the positive numbers is not required.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^4
 * - -10^4 <= nums[i] <= 10^4
 */
public class MoveNegatives {

    public static void main(String[] args) {
        int[] nums1 = {1, 3, -1, -2, -3, 5, 6, -7};
        moveNegatives(nums1);
        Assert.assertEquals(nums1, new int[]{-1, -2, -3, -7, 1, 3, 5, 6});

        int[] nums2 = {-5, -3, -1, -2, -4};
        moveNegatives(nums2);
        Assert.assertEquals(nums2, new int[]{-5, -3, -1, -2, -4});

        int[] nums3 = {1, 2, 3, 4, 5};
        moveNegatives(nums3);
        Assert.assertEquals(nums3, new int[]{1, 2, 3, 4, 5});
    }

    /**
     * APPROACH: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - In-place swapping.
     */
    private static void moveNegatives(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
