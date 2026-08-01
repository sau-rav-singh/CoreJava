package programs.stack;

import org.testng.Assert;

import java.util.Stack;

/**
 * LeetCode 402: Remove K Digits
 *
 * Problem Statement:
 * Given string num representing a non-negative integer num, and an integer k,
 * return the smallest possible integer after removing k digits from num.
 *
 * Constraints:
 * - 1 <= k <= num.length <= 10^5
 * - num consists of only digits.
 * - num does not have any leading zeros except for the zero itself.
 */
public class RemoveKDigits {

    public static void main(String[] args) {
        Assert.assertEquals(removeKDigits("1432219", 3), "1219");
        Assert.assertEquals(removeKDigits("10200", 1), "200");
        Assert.assertEquals(removeKDigits("10", 2), "0");
    }

    /**
     * APPROACH: Monotonic Stack (Optimal)
     *
     * Time Complexity: O(N)
     * - Each digit is pushed and popped at most once.
     *
     * Space Complexity: O(N)
     * - Stack storing digits.
     */
    public static String removeKDigits(String num, int k) {
        if (k == 0) return num;
        if (k >= num.length()) return "0";

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : stack) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            result.append(digit);
        }

        return result.length() == 0 ? "0" : result.toString();
    }
}
