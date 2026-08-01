package programs.dp;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 62: Unique Paths
 *
 * Problem Statement:
 * There is a robot on an m x n grid. The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid. How many possible unique paths are there?
 *
 * Constraints:
 * - 1 <= m, n <= 100
 * - The answer will be less than or equal to 2 * 10^9
 */
public class UniquePaths {

    public static void main(String[] args) {
        Assert.assertEquals(uniquePathsOptimal(3, 7), 28);
        Assert.assertEquals(uniquePathsDP(3, 7), 28);
        Assert.assertEquals(uniquePathsBruteForce(3, 7), 28);
    }

    /**
     * APPROACH 1: 1D DP Array (Optimal Space)
     *
     * Time Complexity: O(m * n)
     * - Nested loops through grid.
     *
     * Space Complexity: O(n)
     * - Single row DP array.
     */
    public static int uniquePathsOptimal(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }

    /**
     * APPROACH 2: 2D DP Array
     *
     * Time Complexity: O(m * n)
     * - Nested loops through grid.
     *
     * Space Complexity: O(m * n)
     * - Full DP table.
     */
    public static int uniquePathsDP(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m - 1][n - 1];
    }

    /**
     * APPROACH 3: Brute Force (Recursion)
     *
     * Time Complexity: O(2^(m+n))
     * - Exponential due to two choices at each step.
     *
     * Space Complexity: O(m + n)
     * - Recursion stack depth.
     */
    public static int uniquePathsBruteForce(int m, int n) {
        return uniquePathsHelper(m, n, 0, 0);
    }

    private static int uniquePathsHelper(int m, int n, int row, int col) {
        if (row == m - 1 && col == n - 1) return 1;
        if (row >= m || col >= n) return 0;

        return uniquePathsHelper(m, n, row + 1, col) + uniquePathsHelper(m, n, row, col + 1);
    }
}
