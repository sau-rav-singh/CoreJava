package programs.strings;

import org.testng.Assert;

/**
 * LeetCode 5: Longest Palindromic Substring
 *
 * Problem Statement:
 * Given a string, find the longest palindromic substring within it.
 * A palindrome is a word that reads the same backward as forward.
 *
 * Constraints:
 * - 1 <= s.length <= 1000
 * - s consists of English letters.
 */
public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String result1 = findLongestPalindromeSubstringBruteForce("babad");
        Assert.assertTrue(result1.equals("bab") || result1.equals("aba"));

        String result2 = findLongestPalindromeSubstringBruteForce("cbbd");
        Assert.assertEquals(result2, "bb");
    }

    /**
     * APPROACH 1: Brute Force
     *
     * Time Complexity: O(N^3)
     * - Nested loops O(N^2) and palindrome check O(N).
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static String findLongestPalindromeSubstringBruteForce(String s) {
        int maxLength = 1;
        String longestPalindrome = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if ((j - i + 1) > maxLength && isPalindrome(s, i, j)) {
                    maxLength = j - i + 1;
                    longestPalindrome = s.substring(i, j + 1);
                }
            }
        }
        return longestPalindrome;
    }

    static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /**
     * APPROACH 2: Expand Around Center (Optimal)
     *
     * Time Complexity: O(N^2)
     * - Expanding around each center.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static String findLongestPalindromeSubstringOptimal(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
