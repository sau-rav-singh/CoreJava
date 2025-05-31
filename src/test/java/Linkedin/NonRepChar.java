package Linkedin;

import java.util.HashMap;
import java.util.Map;

public class NonRepChar {
    // Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1

    public static void main(String[] args) {
        System.out.println(nonRepCharWithMap("geeksforgeeks"));
        System.out.println(nonRepChar("geeksforgeeks"));
    }

    //Time Complexity: O(N)
    //Space Complexity: O(N)
    public static int nonRepCharWithMap(String str) {
        Map<Character, Integer> hm = new HashMap<>();
        for (Character c : str.toLowerCase().toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i)) == 1) return i;
        }
        return -1;
    }

    //Time Complexity: O(N)
    //Space Complexity: O(1)
    public static int nonRepChar(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}