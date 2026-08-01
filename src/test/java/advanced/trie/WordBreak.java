package advanced.trie;

import java.util.List;

public class WordBreak {
    // QUESTION: Given a string s and a dictionary of strings wordDict, return true if s can be segmented into
    // a space-separated sequence of one or more dictionary words. Note that the same word in the dictionary
    // may be reused multiple times in the segmentation.
    // Example: Input: s = "leetcode", wordDict = ["leet","code"]
    //          Output: true
    // Time Complexity: O(n^2) with DP, O(n * L) with Trie where L is max word length
    // Space Complexity: O(n) for DP array

    public static boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Empty string is always valid

        for (int i = 1; i <= n; i++) {
            for (String word : wordDict) {
                int len = word.length();
                if (i >= len && dp[i - len] && s.substring(i - len, i).equals(word)) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        System.out.println(wordBreak(s, wordDict)); // Output: true

        String s2 = "applepenapple";
        List<String> wordDict2 = List.of("apple", "pen");
        System.out.println(wordBreak(s2, wordDict2)); // Output: true
    }
}
