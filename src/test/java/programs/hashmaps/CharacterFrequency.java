package programs.hashmaps;

import org.testng.Assert;

/**
 * Character Frequency
 *
 * Problem Statement:
 * Given a string, calculate the frequency of each character and return the results.
 *
 * Constraints:
 * - 1 <= str.length <= 10^5
 * - str consists of ASCII characters.
 */
public class CharacterFrequency {

    public static void main(String[] args) {
        int[] freq = calculateFrequency("Picture Perfect");
        Assert.assertEquals(freq['P'], 2);
        Assert.assertEquals(freq['i'], 1);
        Assert.assertEquals(freq['c'], 2);
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
    public static int[] calculateFrequency(String str) {
        int[] countArr = new int[256];
        char[] arr = str.toCharArray();
        for (char c : arr) {
            countArr[c]++;
        }
        return countArr;
    }
}
