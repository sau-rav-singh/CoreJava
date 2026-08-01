package programs.array;

import org.testng.Assert;

/**
 * LeetCode 42: Trapping Rain Water
 *
 * Problem Statement:
 * Given an array of non-negative integers representing the height of bars, compute how
 * much water it can trap after raining.
 *
 * Constraints:
 * - n == height.length
 * - 1 <= n <= 2 * 10^4
 * - 0 <= height[i] <= 10^5
 */
public class TrappedRainWater {

    public static void main(String[] args) {
        int[] height = new int[]{4, 2, 0, 6, 3, 2, 5};
        Assert.assertEquals(trapRainWaterDP(height), 9);
        Assert.assertEquals(trapRainWaterTwoPointer(height), 9);
        Assert.assertEquals(trapRainWaterBruteForce(height), 9);
    }

    /**
     * APPROACH 1: Dynamic Programming (Prefix/Suffix Arrays)
     *
     * Time Complexity: O(N)
     * - Three passes through the array.
     *
     * Space Complexity: O(N)
     * - Uses two auxiliary arrays for left and right max boundaries.
     */
    public static int trapRainWaterDP(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int length = height.length;
        int[] leftMaxBoundary = new int[length];
        int[] rightMaxBoundary = new int[length];

        leftMaxBoundary[0] = height[0];
        for (int i = 1; i < length; i++) {
            leftMaxBoundary[i] = Math.max(leftMaxBoundary[i - 1], height[i]);
        }

        rightMaxBoundary[length - 1] = height[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            rightMaxBoundary[i] = Math.max(height[i], rightMaxBoundary[i + 1]);
        }
        int result = 0;
        for (int i = 0; i < length; i++) {
            int waterLevel = Math.min(leftMaxBoundary[i], rightMaxBoundary[i]);
            result += waterLevel - height[i];
        }

        return result;
    }

    /**
     * APPROACH 2: Two Pointers (Optimal Space)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int trapRainWaterTwoPointer(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    /**
     * APPROACH 3: Brute Force
     *
     * Time Complexity: O(N^2)
     * - For each element, find max on left and right.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int trapRainWaterBruteForce(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int leftMax = 0, rightMax = 0;
            for (int j = 0; j <= i; j++) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            water += Math.min(leftMax, rightMax) - height[i];
        }
        return water;
    }
}

