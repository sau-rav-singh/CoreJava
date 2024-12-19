package Linkedin;

public class LongestPalindromicSubstring {

    static boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    static String findLongestPalindromeSubstring(String s) {
        int n = s.length();
        int maxLength = 1; // Single-character palindromes are the smallest valid palindromes
        int startIndex = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int currentLength = end - start + 1; // Length of the current substring
                if (isPalindrome(s, start, end) && currentLength > maxLength) {
                    maxLength = currentLength;
                    startIndex = start;
                }
            }
        }
        return s.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring(str));
        str = "cbbd";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring(str));
    }
}

