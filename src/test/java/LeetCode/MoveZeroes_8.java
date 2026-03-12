package LeetCode;

import java.util.Arrays;

public class MoveZeroes_8 {

    //Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
    //Note that you must do this in-place without making a copy of the array.

    public static void main(String[] args) {
        moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static void moveZeroes(int[] nums) {
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
