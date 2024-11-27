package Linkedin;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    //Time Complexity: O(n)
    //Space Complexity: O(min(n, m))
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0, j = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abacdef";
        int length = lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring: " + length); // Output: 3
    }
}