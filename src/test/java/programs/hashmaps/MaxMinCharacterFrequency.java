package programs.hashmaps;

import org.testng.Assert;

/**
 * Max Min Character Frequency
 *
 * Problem Statement:
 * Given a string, find the character with the maximum frequency and the character
 * with the minimum frequency (excluding characters that don't appear).
 *
 * Constraints:
 * - 1 <= str.length <= 10^5
 * - str consists of ASCII characters.
 */
public class MaxMinCharacterFrequency {

    public static void main(String[] args) {
        char[] result = maxMinOccurence("TeeeessstAutooooooomationn");
        Assert.assertEquals(result[0], 'o');
        Assert.assertEquals(result[1], 'm');
    }

    /**
     * APPROACH: Frequency Array (Optimal for ASCII)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(1)
     * - Fixed size array of 256 for ASCII.
     */
    public static char[] maxMinOccurence(String str) {
        int[] counter = new int[256];
        for (char c : str.toCharArray()) {
            counter[c]++;
        }

        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] > maxCount) {
                maxCount = counter[i];
                maxChar = (char) i;
            }
            if (counter[i] >= 1 && counter[i] < minCount) {
                minCount = counter[i];
                minChar = (char) i;
            }
        }
        return new char[]{maxChar, minChar};
    }
}
