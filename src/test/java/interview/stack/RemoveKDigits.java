package interview.stack;

import java.util.Stack;

public class RemoveKDigits {
    // QUESTION: Given string num representing a non-negative integer num, and an integer k,
    // return the smallest possible integer after removing k digits from num.
    // Example: Input: num = "1432219", k = 3
    //          Output: "1219"
    // Time Complexity: O(n)
    // Space Complexity: O(n)

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

        // Remove remaining k digits from the end
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build result and remove leading zeros
        StringBuilder result = new StringBuilder();
        boolean leadingZero = true;
        for (char digit : stack) {
            if (leadingZero && digit == '0') continue;
            leadingZero = false;
            result.append(digit);
        }

        return result.length() == 0 ? "0" : result.toString();
    }

    public static void main(String[] args) {
        String num1 = "1432219";
        System.out.println(removeKDigits(num1, 3)); // Output: 1219

        String num2 = "10200";
        System.out.println(removeKDigits(num2, 1)); // Output: 200

        String num3 = "10";
        System.out.println(removeKDigits(num3, 2)); // Output: 0
    }
}
