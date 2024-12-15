package Linkedin;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(containsPermutations(s1, s2));
    }

    static boolean containsPermutations(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        // Frequency arrays for s1 and the sliding window in s2
        int[] s1Frequency = new int[26];
        int[] windowFrequency = new int[26];

        // Populate frequency array for s1
        for (char c : s1.toCharArray()) {
            s1Frequency[c - 'a']++;
        }

        // Initialize the sliding window for the first s1.length() characters
        for (int i = 0; i < s1.length(); i++) {
            windowFrequency[s2.charAt(i) - 'a']++;
        }

        // Check if the initial window matches s1's frequency
        if (Arrays.equals(s1Frequency, windowFrequency)) return true;

        // Slide the window across s2
        for (int i = s1.length(); i < s2.length(); i++) {
            // Add the new character to the window
            windowFrequency[s2.charAt(i) - 'a']++;
            // Remove the character that's sliding out of the window
            windowFrequency[s2.charAt(i - s1.length()) - 'a']--;

            // Check if the updated window matches s1's frequency
            if (Arrays.equals(s1Frequency, windowFrequency)) return true;
        }

        return false;
    }
}
