package MyPracticePrograms;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring("babad"));
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromeSubstring("cbbd"));
    }

    static String findLongestPalindromeSubstring(String str) {
        int len = str.length();
        int maxLength = 1;
        String result = String.valueOf(str.charAt(0));
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (isPalindrome(str.substring(i, j)) && (j - i) > maxLength) {
                    result = str.substring(i, j);
                    maxLength=j-i;
                }
            }
        }
        return result;
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        char[] arr = str.toCharArray();
        while (i < j) {
            if (arr[i] != arr[j]) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
