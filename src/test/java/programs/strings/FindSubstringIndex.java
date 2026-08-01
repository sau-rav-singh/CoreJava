package programs.strings;

import org.testng.Assert;

/**
 * LeetCode 28: Find the Index of the First Occurrence in a String
 *
 * Problem Statement:
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 * Constraints:
 * - 1 <= haystack.length, needle.length <= 10^4
 * - haystack and needle consist of only lowercase English characters.
 */
public class FindSubstringIndex {

    public static void main(String[] args) {
        Assert.assertEquals(strStr("sadbutsad", "sad"), 0);
        Assert.assertEquals(strStr("leetcode", "leeto"), -1);
        Assert.assertEquals(strStr("hello", "ll"), 2);
    }

    /**
     * APPROACH: Brute Force (Simple)
     *
     * Time Complexity: O(M * N)
     * - M is haystack length, N is needle length.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * APPROACH 2: Built-in indexOf (Optimal)
     *
     * Time Complexity: O(M * N)
     * - Uses optimized string matching.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int strStrBuiltIn(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

