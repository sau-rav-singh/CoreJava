package Linkedin;

import java.util.Stack;

public class ValidBrackets {
    // QUESTION: Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
    // determine if the input string is valid. An input string is valid if open brackets are closed
    // by the same type of brackets and in the correct order.
    // Example: Input: "()[]{}" -> Output: true
    //          Input: "({[]})" -> Output: true
    //Space/Time Complexity: O(n)

    public static void main(String[] args) {
        String input = "()[]{}";
        System.out.println(isValid(input)); // Output: true

        input = "({[]})";
        System.out.println(isValid(input)); // Output: true
    }

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
