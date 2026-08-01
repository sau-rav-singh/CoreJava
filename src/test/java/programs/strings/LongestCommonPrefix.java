package programs.strings;

import org.testng.Assert;

/**
 * LeetCode 14: Longest Common Prefix
 *
 * Problem Statement:
 * Given an array of strings, find the longest common prefix string amongst the array.
 * If there is no common prefix, return an empty string.
 *
 * Constraints:
 * - 1 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] consists of only lowercase English letters.
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        Assert.assertEquals(longestCommonPrefix(strs), "fl");
    }

    /**
     * APPROACH: Horizontal Scanning (Optimal)
     *
     * Time Complexity: O(S)
     * - S is the sum of all characters in all strings.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) return "";
        String result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int len = commonPrefixLen(result, arr[i]);
            result = result.substring(0, len);
        }
        return result;
    }

    static int commonPrefixLen(String a, String b) {
        int commonLength = 0;
        int minL = Math.min(a.length(), b.length());
        for (int i = 0; i < minL; i++) {
            if (a.charAt(i) == b.charAt(i)) {
                commonLength++;
            } else {
                break;
            }
        }
        return commonLength;
    }
}

