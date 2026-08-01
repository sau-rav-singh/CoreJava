package programs.hashmaps;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 242: Valid Anagram
 *
 * Problem Statement:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
 *
 * Constraints:
 * - 1 <= s.length, t.length <= 5 * 10^4
 * - s and t consist of lowercase English letters.
 */
public class ValidAnagram {

    public static void main(String[] args) {
        // Basic anagram check
        Assert.assertTrue(isAnagramSorting("anagram", "nagaram"));
        Assert.assertTrue(isAnagramFrequency("anagram", "nagaram"));

        // Anagram with spaces and case-insensitive
        Assert.assertTrue(isAnagramWithSpaces("Saurav is Singh Hexaware", "Singh Saurav Hexaware is"));
    }

    /**
     * APPROACH 1: Sorting
     *
     * Time Complexity: O(N log N)
     * - Sorting both strings.
     *
     * Space Complexity: O(N)
     * - Character arrays for sorting.
     */
    public static boolean isAnagramSorting(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        return Arrays.equals(arrayS, arrayT);
    }

    /**
     * APPROACH 2: Frequency Array (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through both strings.
     *
     * Space Complexity: O(1)
     * - Fixed size array of 26 for lowercase letters.
     */
    public static boolean isAnagramFrequency(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] counts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        for (int count : counts) {
            if (count != 0) return false;
        }

        return true;
    }

    /**
     * APPROACH 3: Sorting with space/ignore handling
     *
     * Time Complexity: O(N log N)
     * - Sorting after preprocessing.
     *
     * Space Complexity: O(N)
     * - Character arrays for sorting.
     */
    public static boolean isAnagramWithSpaces(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}

