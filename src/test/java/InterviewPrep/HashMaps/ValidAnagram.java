package InterviewPrep.HashMaps;

import org.testng.Assert;

import java.util.Arrays;

// QUESTION: Given two strings, determine if they are anagrams of each other.
// An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.
public class ValidAnagram {

    public static void main(String[] args) {
        // Basic anagram check
        Assert.assertTrue(isAnagramSorting("anagram", "nagaram"));
        Assert.assertTrue(isAnagramFrequency("anagram", "nagaram"));

        // Anagram with spaces and case-insensitive
        Assert.assertTrue(isAnagramWithSpaces("Saurav is Singh Hexaware", "Singh Saurav Hexaware is"));
    }

    /**
     * Approach 1: Sorting
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     * Use when interviewer asks NOT to use extra data structures
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
     * Approach 2: Frequency Array
     * Time Complexity: O(n)
     * Space Complexity: O(1) - fixed size array of 26
     * Use when only lowercase letters are involved
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
     * Approach 3: Sorting with space/ignore handling
     * Time Complexity: O(n log n)
     * Space Complexity: O(n)
     * Use when strings contain spaces and need case-insensitive comparison
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

