package programs.stack;

import org.testng.Assert;

import java.util.Stack;

/**
 * LeetCode 20: Valid Parentheses
 *
 * Problem Statement:
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid. An input string is valid if open brackets are closed
 * by the same type of brackets and in the correct order.
 *
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - s consists of parentheses only '()[]{}'.
 */
public class ValidBrackets {

    public static void main(String[] args) {
        Assert.assertTrue(isValid("()[]{}"));
        Assert.assertTrue(isValid("({[]})"));
        Assert.assertFalse(isValid("(]"));
        Assert.assertFalse(isValid("([)]"));
    }

    /**
     * APPROACH: Stack (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(N)
     * - Stack storing opening brackets.
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

