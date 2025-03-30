package LeetCode;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchInsertPositionTest {

    //Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        return len;
    }

    public int searchInsertBinary(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    @Test
    public void testExample1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        assertEquals(searchInsert(nums, target), 2);
        assertEquals(searchInsertBinary(nums, target), 2);
    }

    @Test
    public void testExample2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        assertEquals(searchInsert(nums, target), 1);
        assertEquals(searchInsertBinary(nums, target), 1);
    }

    @Test
    public void testExample3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        assertEquals(searchInsert(nums, target), 4);
        assertEquals(searchInsertBinary(nums, target), 4);
    }

    @Test
    public void testExample4() {
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        assertEquals(searchInsert(nums, target), 0);
        assertEquals(searchInsertBinary(nums, target), 0);
    }

    @Test
    public void testExample5() {
        int[] nums = {1};
        int target = 0;
        assertEquals(searchInsert(nums, target), 0);
        assertEquals(searchInsertBinary(nums, target), 0);
    }

    @Test
    public void testExample6() {
        int[] nums = {1};
        int target = 2;
        assertEquals(searchInsert(nums, target), 1);
        assertEquals(searchInsertBinary(nums, target), 1);
    }

    @Test
    public void testExample7() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 3;
        assertEquals(searchInsert(nums, target), 2);
        assertEquals(searchInsertBinary(nums, target), 2);
    }

    @Test
    public void testExample8() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 6;
        assertEquals(searchInsert(nums, target), 5);
        assertEquals(searchInsertBinary(nums, target), 5);
    }

    @Test
    public void testExample9() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 0;
        assertEquals(searchInsert(nums, target), 0);
        assertEquals(searchInsertBinary(nums, target), 0);
    }
}
