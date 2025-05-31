package Linkedin;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring(str));
        str = "cbbd";
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring(str));
    }

    static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    static String findLongestPalindromeSubstring(String s) {
        int maxLength = 1;
        String longestPalindrome = String.valueOf(s.charAt(0));
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if ((j - i) > maxLength && isPalindrome(s, i, j)) {
                    maxLength = j - i;
                    longestPalindrome = s.substring(i, j + 1);
                }
            }
        }
        return longestPalindrome;
    }
}