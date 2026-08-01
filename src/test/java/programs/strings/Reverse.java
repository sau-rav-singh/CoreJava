package programs.strings;

import org.testng.Assert;

/**
 * Reverse String and Words
 *
 * Problem Statement:
 * Given a string, reverse the entire string and also reverse the order of words in the string.
 *
 * Constraints:
 * - 1 <= input.length <= 10^4
 * - input contains English letters and spaces.
 */
public class Reverse {

    public static void main(String[] args) {
        String input = "My Name is Saurav Singh";
        Assert.assertEquals(reverseWords(input), "Singh Saurav is Name My");
        Assert.assertEquals(reverseString(input), "hgniS varuaS si emaN yM");
    }

    /**
     * APPROACH 1: Reverse Words (Optimal)
     *
     * Time Complexity: O(N)
     * - Splitting and reversing words.
     *
     * Space Complexity: O(N)
     * - Array for words and StringBuilder.
     */
    static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        return reversed.toString().trim();
    }

    /**
     * APPROACH 2: Reverse String (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through characters.
     *
     * Space Complexity: O(N)
     * - StringBuilder for result.
     */
    static String reverseString(String input) {
        char[] characters = input.toCharArray();
        StringBuilder reversed = new StringBuilder();

        for (int i = characters.length - 1; i >= 0; i--) {
            reversed.append(characters[i]);
        }

        return reversed.toString();
    }
}

