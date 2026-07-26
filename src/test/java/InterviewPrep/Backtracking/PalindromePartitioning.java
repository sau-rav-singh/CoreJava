package InterviewPrep.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    // QUESTION: Given a string s, partition s such that every substring of the partition is a palindrome.
    // Return all possible palindrome partitionings of s.
    // Example: Input: s = "aab"
    //          Output: [["a","a","b"],["aa","b"]]
    // Time Complexity: O(n * 2^n)
    // Space Complexity: O(n) for recursion stack

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), s, 0);
        return result;
    }

    private static void backtrack(List<List<String>> result, List<String> current, String s, int start) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            if (isPalindrome(substring)) {
                current.add(substring);
                backtrack(result, current, s, end);
                current.remove(current.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> result = partition(s);
        System.out.println("Palindrome partitions of \"" + s + "\":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}
