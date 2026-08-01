package programs.maths;

import org.testng.Assert;

/**
 * LeetCode 7: Reverse Integer
 *
 * Problem Statement:
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value
 * to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
 *
 * Constraints:
 * - -2^31 <= x <= 2^31 - 1
 */
public class IntegerReverse {

    public static void main(String[] args) {
        Assert.assertEquals(reverseInteger(12345), 54321);
        Assert.assertEquals(reverseInteger(123), 321);
        Assert.assertEquals(reverseInteger(-123), -321);
    }

    /**
     * APPROACH: Mathematical Reversal (Optimal)
     *
     * Time Complexity: O(log N)
     * - Number of digits in the integer.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static int reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;

            // Check for overflow before updating rev
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }
}

