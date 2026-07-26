package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    // QUESTION: Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    // Example: Input: n = 3
    //          Output: ["((()))","(()())","(())()","()(())","()()()"]
    // Time Complexity: O(4^n / sqrt(n))
    // Space Complexity: O(n) for recursion stack

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println("All valid parentheses combinations for n=" + n + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
