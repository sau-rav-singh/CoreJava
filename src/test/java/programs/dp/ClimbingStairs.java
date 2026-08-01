package programs.dp;

import org.testng.Assert;

/**
 * LeetCode 70: Climbing Stairs
 *
 * Problem Statement:
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Constraints:
 * - 1 <= n <= 45
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        Assert.assertEquals(climbStairsDP(5), 8);
        Assert.assertEquals(climbStairsOptimal(5), 8);
        Assert.assertEquals(climbStairsBruteForce(5), 8);
    }

    /**
     * APPROACH 1: Dynamic Programming with Array
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(N)
     * - Uses array of size n+1.
     */
    public static int climbStairsDP(int n) {
        if (n <= 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    /**
     * APPROACH 2: Constant Space (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int climbStairsOptimal(int n) {
        if (n <= 2) {
            return n;
        }
        int prev2 = 1;
        int prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    /**
     * APPROACH 3: Brute Force (Recursion)
     *
     * Time Complexity: O(2^N)
     * - Exponential due to repeated calculations.
     *
     * Space Complexity: O(N)
     * - Recursion stack depth.
     */
    public static int climbStairsBruteForce(int n) {
        if (n <= 2) {
            return n;
        }
        return climbStairsBruteForce(n - 1) + climbStairsBruteForce(n - 2);
    }
}

