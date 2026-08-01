package programs.stack;

import org.testng.Assert;

import java.util.Stack;

/**
 * LeetCode 150: Evaluate Reverse Polish Notation
 *
 * Problem Statement:
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are: +, -, *, /. Each operand may be an integer or another expression.
 * Note: Division between two integers should truncate toward zero.
 *
 * Constraints:
 * - 1 <= tokens.length <= 10^4
 * - tokens[i] is either an operator: "+", "-", "*", or "/", or an integer.
 */
public class EvaluateRPN {

    public static void main(String[] args) {
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        Assert.assertEquals(evalRPN(tokens1), 9);

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        Assert.assertEquals(evalRPN(tokens2), 6);

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Assert.assertEquals(evalRPN(tokens3), 22);
    }

    /**
     * APPROACH: Stack (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through tokens.
     *
     * Space Complexity: O(N)
     * - Stack storing operands.
     */
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperator(token, a, b);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int applyOperator(String operator, int a, int b) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
}
