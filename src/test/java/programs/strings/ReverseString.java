package programs.strings;

import org.testng.Assert;

/**
 * Reverse Each Word
 *
 * Problem Statement:
 * Given a string, reverse each word in the string while maintaining the original order of words.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str contains English letters and spaces.
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "India is my country";
        String result = reverseEachWord(str);
        Assert.assertEquals(result, "aidnI si ym yrtnuoc");
    }

    /**
     * APPROACH: Split and Reverse (Optimal)
     *
     * Time Complexity: O(N * M)
     * - N words, M average word length.
     *
     * Space Complexity: O(N)
     * - Array for words and StringBuilder.
     */
    public static String reverseEachWord(String str) {
        String[] arr = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            char[] wordArray = arr[i].toCharArray();
            for (int j = wordArray.length - 1; j >= 0; j--) {
                result.append(wordArray[j]);
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}

