package LeetCode;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        Assert.assertEquals(twoSum(new int[]{3, 2, 4}, 7), new int[]{0, 2});
    }

    public static int[] twoSum(int[] nums, int target) {//O(n)
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
