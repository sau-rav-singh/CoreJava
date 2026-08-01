package programs.hashmaps;

import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 387: First Unique Character in a String
 *
 * Problem Statement:
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s consists of only lowercase English letters.
 */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Assert.assertEquals(nonRepCharWithMap("geeksforgeeks"), 5);
        Assert.assertEquals(nonRepChar("geeksforgeeks"), 5);
        Assert.assertEquals(nonRepCharBruteForce("geeksforgeeks"), 5);
    }

    /**
     * APPROACH 1: HashMap (Optimal for general case)
     *
     * Time Complexity: O(N)
     * - Two passes through the string.
     *
     * Space Complexity: O(N)
     * - HashMap storing character frequencies.
     */
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

    /**
     * APPROACH 2: Frequency Array (Optimal for lowercase)
     *
     * Time Complexity: O(N)
     * - Two passes through the string.
     *
     * Space Complexity: O(1)
     * - Fixed size array of 26.
     */
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

    /**
     * APPROACH 3: Brute Force
     *
     * Time Complexity: O(N²)
     * - For each character, check all other characters.
     *
     * Space Complexity: O(1)
     * - Uses constant extra space.
     */
    public static int nonRepCharBruteForce(String s) {
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) return i;
        }
        return -1;
    }
}
