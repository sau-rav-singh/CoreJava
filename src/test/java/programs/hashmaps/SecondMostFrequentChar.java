package programs.hashmaps;

import org.testng.Assert;

/**
 * Second Most Frequent Character
 *
 * Problem Statement:
 * Given a string, find the second most frequent character in it.
 *
 * Constraints:
 * - 1 <= str.length <= 10^5
 * - str consists of lowercase English letters.
 */
public class SecondMostFrequentChar {

    public static void main(String[] args) {
        Assert.assertEquals(findSecondMostFrequent("banana"), 'n');
    }

    /**
     * APPROACH: Frequency Array (Optimal for lowercase)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(1)
     * - Fixed size array of 26.
     */
    public static char findSecondMostFrequent(String str) {
        char[] arr = str.toCharArray();
        int[] counter = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int loopCount = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    loopCount++;
                    counter[j] = -1;
                }
            }
            if (counter[i] != -1) {
                counter[i] = loopCount;
            }
        }

        int largest = 0;
        int secLar = 0;

        for (int i = 0; i < arr.length; i++) {
            if (counter[i] > counter[largest]) {
                secLar = largest;
                largest = i;
            } else if (counter[i] > counter[secLar] && counter[i] != counter[largest]) {
                secLar = i;
            }
        }

        return arr[secLar];
    }
}

