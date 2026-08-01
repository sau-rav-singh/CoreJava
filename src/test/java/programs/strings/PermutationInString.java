package programs.strings;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 567: Permutation in String
 *
 * Problem Statement:
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * A permutation of a string is any rearrangement of its characters.
 *
 * Constraints:
 * - 1 <= s1.length, s2.length <= 10^4
 * - s1 and s2 consist of lowercase English letters.
 */
public class PermutationInString {

    public static void main(String[] args) {
        Assert.assertTrue(containsPermutations("ab", "eidbaooo"));
        Assert.assertFalse(containsPermutations("ab", "eidboaoo"));
    }

    /**
     * APPROACH: Sliding Window with Frequency Arrays (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through s2.
     *
     * Space Complexity: O(1)
     * - Fixed size arrays of 26.
     */
    static boolean containsPermutations(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Freq = new int[26];
        int[] windowFreq = new int[26];

        for (char c : s1.toCharArray()) {
            s1Freq[c - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            windowFreq[s2.charAt(i) - 'a']++;
            if (i >= s1.length()) {
                windowFreq[s2.charAt(i - s1.length()) - 'a']--;
            }
            if (Arrays.equals(s1Freq, windowFreq)) {
                return true;
            }
        }
        return false;
    }
}

