package programs.dp;

import java.util.Arrays;

public class UniquePaths {
    // QUESTION: There is a robot on an m x n grid. The robot can only move either down or right at any point in time.
    // The robot is trying to reach the bottom-right corner of the grid. How many possible unique paths are there?
    // Example: Input: m = 3, n = 7
    //          Output: 28
    // Time Complexity: O(m * n)
    // Space Complexity: O(n) optimized

    public static int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7)); // Output: 28
        System.out.println(uniquePaths(3, 2)); // Output: 3
    }
}
