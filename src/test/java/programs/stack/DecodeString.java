package programs.stack;

import java.util.Stack;

public class DecodeString {
    // QUESTION: Given an encoded string, return its decoded string.
    // The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets
    // is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
    // Example: Input: s = "3[a]2[bc]"
    //          Output: "aaabcbc"
    //          Input: s = "3[a2[c]]"
    //          Output: "accaccacc"
    // Time Complexity: O(n)
    // Space Complexity: O(n)

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

    public static void main(String[] args) {
        String s1 = "3[a]2[bc]";
        System.out.println(decodeString(s1)); // Output: aaabcbc

        String s2 = "3[a2[c]]";
        System.out.println(decodeString(s2)); // Output: accaccacc

        String s3 = "2[abc]3[cd]ef";
        System.out.println(decodeString(s3)); // Output: abcabccdcdcdef
    }
}
