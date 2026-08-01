package programs.strings;

import org.testng.Assert;

/**
 * Reverse String Without Special Characters
 *
 * Problem Statement:
 * Given a string containing alphabetic characters and special characters, reverse only
 * the alphabetic characters while keeping the special characters in their original positions.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str consists of alphabetic characters and special characters.
 */
public class ReverseStringWithoutSpecialChars {

    public static void main(String[] args) {
        String str = "a!b?c";
        String reversedStr = reverseString(str);
        Assert.assertEquals(reversedStr, "c?b!a");
    }

    /**
     * APPROACH: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass with two pointers.
     *
     * Space Complexity: O(N)
     * - Character array for in-place modification.
     */
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            if (!Character.isAlphabetic(charArray[left])) {
                left++;
            } else if (!Character.isAlphabetic(charArray[right])) {
                right--;
            } else {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(charArray);
    }
}
