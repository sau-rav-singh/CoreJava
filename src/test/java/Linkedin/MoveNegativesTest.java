package Linkedin;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class MoveNegativesTest {

    @Test
    public void testMoveNegatives() {
        int[] nums1 = {1, 3, -1, -2, -3, 5, 6, -7};
        moveNegatives(nums1);
        assertEquals(nums1, new int[]{-1, -2, -3, -7, 1, 3, 5, 6}, "Test Case 1 Failed");

        int[] nums2 = {-5, -3, -1, -2, -4};
        moveNegatives(nums2);
        assertEquals(nums2, new int[]{-5, -3, -1, -2, -4}, "Test Case 2 Failed");

        int[] nums3 = {1, 2, 3, 4, 5};
        moveNegatives(nums3);
        assertEquals(nums3, new int[]{1, 2, 3, 4, 5}, "Test Case 3 Failed");

        int[] nums4 = {-1};
        moveNegatives(nums4);
        assertEquals(nums4, new int[]{-1}, "Test Case 4 Failed");

        int[] nums5 = {};
        moveNegatives(nums5);
        assertEquals(nums5, new int[]{}, "Test Case 5 Failed");

        int[] nums6 = {1};
        moveNegatives(nums6);
        assertEquals(nums6, new int[]{1}, "Test Case 6 Failed");

        int[] nums7 = {-1, 1, -2, 2, -3, 3};
        moveNegatives(nums7);
        assertEquals(nums7, new int[]{-1, -2, -3, 1, 2, 3}, "Test Case 7 Failed");
    }

    private void moveNegatives(int[] nums) {
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