package programs.strings;

import org.testng.Assert;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 3: Longest Substring Without Repeating Characters
 *
 * Problem Statement:
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Constraints:
 * - 0 <= s.length <= 5 * 10^4
 * - s consists of English letters, digits, symbols and spaces.
 */
public class LongestUniqueCharSubstring {

    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        String result = longestSubStrWithoutRepetition(s);
        Assert.assertEquals(result.length(), 7);
    }

    /**
     * APPROACH: Sliding Window with HashSet (Optimal)
     *
     * Time Complexity: O(N)
     * - Each character is added and removed at most once.
     *
     * Space Complexity: O(min(N, M))
     * - M is the size of the character set.
     */
    static String longestSubStrWithoutRepetition(String str) {
        Set<Character> hs = new HashSet<>();
        int j = 0;
        int maxLength = 0;
        int startIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            while (hs.contains(str.charAt(i))) {
                hs.remove(str.charAt(j));
                j++;
            }
            hs.add(str.charAt(i));

            if (i - j + 1 > maxLength) {
                maxLength = i - j + 1;
                startIndex = j;
            }
        }
        return str.substring(startIndex, startIndex + maxLength);
    }
}
