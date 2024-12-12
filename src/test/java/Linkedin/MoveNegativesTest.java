package Linkedin;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class MoveNegativesTest {

    @Test
    public void testMoveNegatives_basicCase() {
        int[] nums = {1, 3, -1, -2, -3, 5, 6, -7};
        moveNegatives(nums);
        int[] expected = {-1, -2, -3, -7, 1, 3, 5, 6};
        assertEquals(nums, expected);
    }

    @Test
    public void testMoveNegatives_allNegatives() {
        int[] nums = {-5, -3, -1, -2, -4};
        moveNegatives(nums);
        int[] expected = {-5, -3, -1, -2, -4};
        assertEquals(nums, expected);
    }

    @Test
    public void testMoveNegatives_noNegatives() {
        int[] nums = {1, 2, 3, 4, 5};
        moveNegatives(nums);
        int[] expected = {1, 2, 3, 4, 5};
        assertEquals(nums, expected);
    }

    @Test
    public void testMoveNegatives_singleNegative() {
        int[] nums = {-1};
        moveNegatives(nums);
        int[] expected = {-1};
        assertEquals(nums, expected);
    }

    @Test
    public void testMoveNegatives_emptyArray() {
        int[] nums = {};
        moveNegatives(nums);
        int[] expected = {};
        assertEquals(nums, expected);
    }

    @Test
    public void testMoveNegatives_singlePositive() {
        int[] nums = {1};
        moveNegatives(nums);
        int[] expected = {1};
        assertEquals(nums, expected);
    }

    @Test
    public void testMoveNegatives_mixedStart() {
        int[] nums = {-1, 1, -2, 2, -3, 3};
        moveNegatives(nums);
        int[] expected = {-1, -2, -3, 1, 2, 3};
        assertEquals(nums, expected);
    }


    private void moveNegatives(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (i != insertIndex) {
                    int temp = nums[i];
                    for (int j = i; j > insertIndex; j--) {
                        nums[j] = nums[j - 1];
                    }
                    nums[insertIndex] = temp;
                }
                insertIndex++;
            }
        }
    }
}