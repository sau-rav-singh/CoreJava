package programs.strings;

import org.testng.Assert;

/**
 * Max Consecutive Character
 *
 * Problem Statement:
 * Given a string, find the character that appears consecutively the maximum number of times.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str consists of printable ASCII characters.
 */
public class MaxConsecutiveCharacter {

    public static void main(String[] args) {
        String word = "Amazon is a great company as it has Atooozzzz";
        char result = maxRepeating(word);
        Assert.assertEquals(result, 'z');
    }

    /**
     * APPROACH: Single Pass (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static char maxRepeating(String str) {
        int maxCount = 0;
        char result = str.charAt(0);

        int currentCount = 1;
        char currentChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == currentChar) {
                currentCount++;
            } else {
                currentCount = 1;
                currentChar = str.charAt(i);
            }

            if (currentCount > maxCount) {
                maxCount = currentCount;
                result = currentChar;
            }
        }

        return result;
    }
}

