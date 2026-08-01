package programs.dp;

import org.testng.Assert;

/**
 * LeetCode 72: Edit Distance
 *
 * Problem Statement:
 * Given two strings word1 and word2, return the minimum number of operations required to convert
 * word1 to word2. You have the following three operations permitted on a word:
 * - Insert a character
 * - Delete a character
 * - Replace a character
 *
 * Constraints:
 * - 0 <= word1.length, word2.length <= 500
 * - word1 and word2 consist of lowercase English letters.
 */
public class EditDistance {

    public static void main(String[] args) {
        Assert.assertEquals(minDistanceDP("horse", "ros"), 3);
        Assert.assertEquals(minDistanceDP("intention", "execution"), 5);
        Assert.assertEquals(minDistanceBruteForce("horse", "ros"), 3);
    }

    /**
     * APPROACH 1: Dynamic Programming (Optimal)
     *
     * Time Complexity: O(m * n)
     * - m and n are lengths of the two strings.
     *
     * Space Complexity: O(m * n)
     * - DP table of size (m+1) x (n+1).
     */
    public static int minDistanceDP(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // Initialize base cases
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i; // delete all characters
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j; // insert all characters
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], // replace
                                   Math.min(dp[i - 1][j],    // delete
 dp[i][j - 1]));  // insert
                }
            }
        }

        return dp[m][n];
    }

    /**
     * APPROACH 2: Brute Force (Recursion)
     *
     * Time Complexity: O(3^(m+n))
     * - Exponential due to three choices at each step.
     *
     * Space Complexity: O(m + n)
     * - Recursion stack depth.
     */
    public static int minDistanceBruteForce(String word1, String word2) {
        return minDistanceHelper(word1, word2, word1.length(), word2.length());
    }

    private static int minDistanceHelper(String word1, String word2, int m, int n) {
        if (m == 0) return n;
        if (n == 0) return m;

        if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            return minDistanceHelper(word1, word2, m - 1, n - 1);
        }

        return 1 + Math.min(
            minDistanceHelper(word1, word2, m, n - 1), // insert
            Math.min(
                minDistanceHelper(word1, word2, m - 1, n), // delete
                minDistanceHelper(word1, word2, m - 1, n - 1) // replace
            )
        );
    }
}
