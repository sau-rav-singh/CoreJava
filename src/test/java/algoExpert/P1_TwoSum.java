package algoExpert;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class P1_TwoSum {
    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    //S/T:O(n)
    @Test
    public void testTwoSum() {
        Assert.assertEquals(twoSum(new int[]{1, 3, 5}, 6), new int[]{0, 2});
        Assert.assertEquals(twoSum(new int[]{2, 7, 11, 15}, 9), new int[]{0, 1});
        Assert.assertEquals(twoSum(new int[]{3, 3, 3}, 6), new int[]{0, 1});
        Assert.assertEquals(twoSum(new int[]{-1, -8, 5, 10}, -3), new int[]{1, 2});
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashmap.containsKey(complement)) {
                return new int[]{hashmap.get(complement), i};
            }
            hashmap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
