package Linkedin;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand around a single character (odd-length palindrome)
            int len1 = expandAroundCenter(s, i, i);
            // Expand around a pair of characters (even-length palindrome)
            int len2 = expandAroundCenter(s, i, i + 1);

            // Get the maximum length of the palindrome found
            int len = Math.max(len1, len2);

            // Update the start and end indices if a longer palindrome is found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static void main(String[] args) {
        String str = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));
        str = "cbbd";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(str));
    }
}

