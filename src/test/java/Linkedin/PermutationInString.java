package Linkedin;

import java.util.Arrays;

// QUESTION: Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
// A permutation of a string is any rearrangement of its characters.
// Example: Input: s1 = "ab", s2 = "eidbaooo" -> Output: true (s2 contains "ba" which is a permutation of "ab")
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(containsPermutations(s1, s2));
    }
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
