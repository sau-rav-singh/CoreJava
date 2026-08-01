package programs.twopointers;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode 11: Container With Most Water
 *
 * Problem Statement:
 * You are given an integer array height of length n. There are n vertical lines drawn such
 * that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together
 * with the x-axis form a container, such that the container contains the most water. Return the
 * maximum amount of water a container can store.
 *
 * Constraints:
 * - n == height.length
 * - 2 <= n <= 10^5
 * - 0 <= height[i] <= 10^4
 */
public class ContainerWithMostWater {

    public static void main(String[] args) {
        List<Integer> height = new ArrayList<>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        Assert.assertEquals(calculateMaxArea(height), 49);
    }

    /**
     * APPROACH: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass with two pointers.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int calculateMaxArea(List<Integer> height) {
        int i = 0, j = height.size() - 1;
        int maxArea = Integer.MIN_VALUE;
        while (i <= j) {
            int width = j - i;
            int length = Math.min(height.get(i), height.get(j));
            maxArea = Math.max(maxArea, width * length);

            if (height.get(i) < height.get(j)) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N^2)
     * - Nested loops checking all pairs.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int calculateMaxAreaBruteForce(List<Integer> height) {
        int maxArea = 0;
        int n = height.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = j - i;
                int length = Math.min(height.get(i), height.get(j));
                maxArea = Math.max(maxArea, width * length);
            }
        }
        return maxArea;
    }
}
