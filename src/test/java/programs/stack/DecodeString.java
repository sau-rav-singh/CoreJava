package programs.stack;

import org.testng.Assert;

import java.util.Stack;

/**
 * LeetCode 394: Decode String
 *
 * Problem Statement:
 * Given an encoded string, return its decoded string.
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
 * is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * Constraints:
 * - 1 <= s.length <= 30
 * - s consists of lowercase English letters, digits, and square brackets '[]'.
 * - s is a valid encoded string.
 */
public class DecodeString {

    public static void main(String[] args) {
        Assert.assertEquals(decodeString("3[a]2[bc]"), "aaabcbc");
        Assert.assertEquals(decodeString("3[a2[c]]"), "accaccacc");
        Assert.assertEquals(decodeString("2[abc]3[cd]ef"), "abcabccdcdcdef");
    }

    /**
     * APPROACH: Two Stacks (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(N)
     * - Stacks for counts and strings.
     */
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(k);
                stringStack.push(currentString);
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder decodedString = stringStack.pop();
                for (int i = 0; i < count; i++) {
                    decodedString.append(currentString);
                }
                currentString = decodedString;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }
}
