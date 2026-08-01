package programs.strings;

import org.testng.Assert;

/**
 * LeetCode 9: Palindrome Number
 *
 * Problem Statement:
 * Given an integer, determine if it is a palindrome. A palindrome number reads the same
 * backward as forward. Negative numbers are not palindromes.
 *
 * Constraints:
 * - -2^31 <= x <= 2^31 - 1
 */
public class NumberPalindrome {

    public static void main(String[] args) {
        Assert.assertTrue(isPalindrome(121));
        Assert.assertTrue(isPalindrome(0));
        Assert.assertTrue(isPalindrome(1));
        Assert.assertFalse(isPalindrome(-121));
        Assert.assertFalse(isPalindrome(123));
    }

    /**
     * APPROACH: Reverse Half (Optimal)
     *
     * Time Complexity: O(log10(N))
     * - Number of digits in the number.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x % 10 == 0) return false;

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }

    /**
     * APPROACH 2: String Conversion (Simple)
     *
     * Time Complexity: O(N)
     * - N is the number of digits.
     *
     * Space Complexity: O(N)
     * - String representation.
     */
    static boolean isPalindromeString(int x) {
        if (x < 0) return false;
        String str = String.valueOf(x);
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

