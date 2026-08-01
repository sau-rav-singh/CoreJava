package programs.dp;

import org.testng.Assert;

/**
 * LeetCode 1143: Longest Common Subsequence
 *
 * Problem Statement:
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * A subsequence of a string is a new string generated from the original string with some characters
 * (can be none) deleted without changing the relative order of the remaining characters.
 *
 * Constraints:
 * - 1 <= text1.length, text2.length <= 1000
 * - text1 and text2 consist of only lowercase English characters.
 */
public class LongestCommonSubsequence {

    public static void main(String[] args) {
        Assert.assertEquals(longestCommonSubsequenceDP("abcde", "ace"), 3);
        Assert.assertEquals(longestCommonSubsequenceDP("abc", "abc"), 3);
        Assert.assertEquals(longestCommonSubsequenceDP("abc", "def"), 0);
        Assert.assertEquals(longestCommonSubsequenceBruteForce("abcde", "ace"), 3);
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
    public static int longestCommonSubsequenceDP(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[m][n];
    }

    /**
     * APPROACH 2: Brute Force (Recursion)
     *
     * Time Complexity: O(2^(m+n))
     * - Exponential due to two choices at each character.
     *
     * Space Complexity: O(m + n)
     * - Recursion stack depth.
     */
    public static int longestCommonSubsequenceBruteForce(String text1, String text2) {
        return lcsHelper(text1, text2, text1.length(), text2.length());
    }

    private static int lcsHelper(String text1, String text2, int m, int n) {
        if (m == 0 || n == 0) return 0;

        if (text1.charAt(m - 1) == text2.charAt(n - 1)) {
            return 1 + lcsHelper(text1, text2, m - 1, n - 1);
        }

        return Math.max(
            lcsHelper(text1, text2, m - 1, n),
            lcsHelper(text1, text2, m, n - 1)
        );
    }
}
