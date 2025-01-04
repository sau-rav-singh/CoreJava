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
        int i=0,j=0;
        for(;j<nums.length;j++){
            if(nums[j]<0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}