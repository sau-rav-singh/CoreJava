package Linkedin;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueCharSubstring {
    //Time Complexity: O(n)
    //Space Complexity: O(min(n, m))
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

    public static void main(String[] args) {
        String s = "GEEKSFORGEEKS";
        System.out.println(longestSubStrWithoutRepetition(s));
    }
}