package programs.maths;

import org.testng.Assert;

/**
 * LeetCode 69: Sqrt(x)
 *
 * Problem Statement:
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 *
 * Constraints:
 * - 0 <= x <= 2^31 - 1
 */
public class SquareRoot {

    public static void main(String[] args) {
        Assert.assertEquals(mySqrtBinarySearch(9), 3);
        Assert.assertEquals(mySqrtBinarySearch(4), 2);
        Assert.assertEquals(mySqrtBinarySearch(8), 2);
    }

    /**
     * APPROACH 1: Binary Search (Optimal)
     *
     * Time Complexity: O(log N)
     * - Binary search on the range [1, x].
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int mySqrtBinarySearch(int x) {
        if (x == 0) {
            return 0;
        }

        long left = 1;
        long right = x;
        long ans = 1;

        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return (int) ans;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(sqrt(N))
     * - Linear search from 1 to sqrt(x).
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int mySqrtBruteForce(int x) {
        if (x == 0) return 0;

        int i = 1;
        while (i <= x / i) {
            i++;
        }
        return i - 1;
    }
}

