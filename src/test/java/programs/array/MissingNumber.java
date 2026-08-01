package programs.array;

import org.testng.Assert;

/**
 * LeetCode 268: Missing Number
 *
 * Problem Statement:
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Constraints:
 * - n == nums.length
 * - 1 <= n <= 10^4
 * - 0 <= nums[i] <= n
 * - All the numbers of nums are unique.
 */
public class MissingNumber {

    public static void main(String[] args) {
        Assert.assertEquals(missingNumberSum(new int[]{3, 0, 1}), 2);
        Assert.assertEquals(missingNumberXOR(new int[]{3, 0, 1}), 2);
        Assert.assertEquals(missingNumberBruteForce(new int[]{3, 0, 1}), 2);
    }

    /**
     * APPROACH 1: Mathematical Sum (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass to calculate array sum.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int missingNumberSum(int[] nums) {
        int len = nums.length;
        int sum = (len * (len + 1)) / 2;
        int arraySum = 0;
        for (int i : nums) {
            arraySum += i;
        }
        return sum - arraySum;
    }

    /**
     * APPROACH 2: XOR (Optimal, avoids overflow)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int missingNumberXOR(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= i ^ nums[i];
        }
        xor ^= n;
        return xor;
    }

    /**
     * APPROACH 3: Brute Force
     *
     * Time Complexity: O(N^2)
     * - For each number in range, search in array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int missingNumberBruteForce(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }
}

