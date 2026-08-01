package programs.strings;

import org.testng.Assert;

/**
 * LeetCode 58: Length of Last Word
 *
 * Problem Statement:
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * A word is a maximal substring consisting of non-space characters only.
 *
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - s consists of only English letters and spaces ' '.
 * - There will be at least one word in s.
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        Assert.assertEquals(lengthOfLastWord("Hello World"), 5);
        Assert.assertEquals(lengthOfLastWord("   fly me   to   the moon  "), 4);
        Assert.assertEquals(lengthOfLastWord("luffy is still joyboy"), 6);
    }

    /**
     * APPROACH: Split and Get Last (Optimal)
     *
     * Time Complexity: O(N)
     * - Splitting the string.
     *
     * Space Complexity: O(N)
     * - Array for split strings.
     */
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] splitStrings = s.split("\\s+");
        int len = splitStrings.length - 1;
        return splitStrings[len].length();
    }

    /**
     * APPROACH 2: Reverse Traversal (Optimal Space)
     *
     * Time Complexity: O(N)
     * - Single pass from the end.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int lengthOfLastWordOptimal(String s) {
        int length = 0;
        int i = s.length() - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Count characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

