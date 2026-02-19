package LeetCode;

import org.testng.Assert;

import java.util.Arrays;

public class ValidAnagram_3 {

    public static void main(String[] args) {
        Assert.assertTrue(isAnagram("anagram", "nagaram"));
        Assert.assertTrue(isAnagramOptimised("anagram", "nagaram"));
    }

    /**
     * Time Complexity: O(nlogn)
     * Space Complexity: O(n)
     */

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] arrayS = s.toCharArray();
        char[] arrayT = t.toCharArray();

        Arrays.sort(arrayS);
        Arrays.sort(arrayT);

        return Arrays.equals(arrayS, arrayT);
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static boolean isAnagramOptimised(String s, String t) {
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

}
