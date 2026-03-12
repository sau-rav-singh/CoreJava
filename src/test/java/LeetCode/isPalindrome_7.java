package LeetCode;

import org.testng.Assert;

public class isPalindrome_7 {
    //A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
    //non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    public static void main(String[] args) {
        Assert.assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    /**
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
