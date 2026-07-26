package InterviewPrep.DynamicProgramming;

public class EditDistance {
    // QUESTION: Given two strings word1 and word2, return the minimum number of operations required to convert
    // word1 to word2. You have the following three operations permitted on a word:
    // - Insert a character
    // - Delete a character
    // - Replace a character
    // Example: Input: word1 = "horse", word2 = "ros"
    //          Output: 3 (horse -> rorse (replace 'h' with 'r') -> rose (remove 'r') -> ros (remove 'e'))
    // Time Complexity: O(m * n)
    // Space Complexity: O(m * n)

    public static int minDistance(String word1, String word2) {
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

    public static void main(String[] args) {
        System.out.println(minDistance("horse", "ros")); // Output: 3
        System.out.println(minDistance("intention", "execution")); // Output: 5
    }
}
