package programs.strings;

import org.testng.Assert;

/**
 * Valid Palindrome
 *
 * Problem Statement:
 * Given a string, determine if it is a palindrome. A palindrome reads the same backward as forward.
 *
 * Constraints:
 * - 1 <= s.length <= 2 * 10^5
 * - s consists of printable ASCII characters.
 */
public class Palindrome {

    public static void main(String[] args) {
        Assert.assertTrue(isPalindromeStringBuilder("Madam"));
        Assert.assertTrue(isPalindromeTwoPointer("A man, a plan, a canal: Panama"));
        Assert.assertFalse(isPalindromeTwoPointer("race a car"));
    }

    /**
     * APPROACH 1: StringBuilder (Simple)
     *
     * Time Complexity: O(N)
     * - Building reversed string.
     *
     * Space Complexity: O(N)
     * - StringBuilder for reversed string.
     */
    public static boolean isPalindromeStringBuilder(String s) {
        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            rev.append(s.charAt(i));
        }
        return s.equalsIgnoreCase(rev.toString());
    }

    /**
     * APPROACH 2: Two Pointers with alphanumeric filtering (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the string.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static boolean isPalindromeTwoPointer(String s) {
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

