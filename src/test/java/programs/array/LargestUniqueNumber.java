package programs.array;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1133: Largest Unique Number
 * Given an array of integers `nums`, return the largest integer that occurs only once.
 * If no such integer exists, return -1.
 * Constraints:
 * - 1 <= nums.length <= 2000
 * - 0 <= nums[i] <= 1000
 */
public class LargestUniqueNumber {

    public static void main(String[] args) {
        // Test Approach 1
        Assert.assertEquals(findLargestUniqueNumber(new int[]{2, 2, 2, 2}), -1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 2, 2, 3, 3, 4, 4, 4}), 1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 2, 3, 4, 5}), 5);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 1, 2, 2, 3, 4}), 4);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{4, 3, 3, 2, 2, 1}), 4);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{3, 1, 4, 1, 5, 5}), 4);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{}), -1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{99}), 99);

        // Test Approach 2 (General)
        Assert.assertEquals(findLargestUniqueNumberHashMap(new int[]{3, 1, 4, 1, 5, 5}), 4);
    }

    /**
     * Approach 1: Counting Array (Optimal for LeetCode Constraints)
     * Time Complexity: O(N + K) where N = nums.length and K = max value (1000) -> O(N)
     * Space Complexity: O(K) where K = max value range -> O(1) auxiliary space
     */
    public static int findLargestUniqueNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int[] count = new int[1001];

        for (int num : nums)
            count[num]++;

        for (int num = count.length - 1; num >= 0; num--)
            if (count[num] == 1)
                return num;

        return -1;
    }

    /**
     * Approach 2: HashMap (General Solution for arbitrary/negative numbers)
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static int findLargestUniqueNumberHashMap(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        int maxUnique = -1;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                maxUnique = Math.max(maxUnique, entry.getKey());
            }
        }
        return maxUnique;
    }

}