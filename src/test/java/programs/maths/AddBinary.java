package programs.maths;

import org.testng.Assert;

/**
 * LeetCode 67: Add Binary
 *
 * Problem Statement:
 * Given two binary strings a and b, return their sum as a binary string.
 *
 * Constraints:
 * - 1 <= a.length, b.length <= 10^4
 * - a and b consist only of '0' or '1' characters.
 * - Each string does not contain leading zeros except for the zero itself.
 */
public class AddBinary {

    public static void main(String[] args) {
        Assert.assertEquals(addBinary("11", "1"), "100");
        Assert.assertEquals(addBinary("1010", "1011"), "10101");
    }

    /**
     * APPROACH: Bit Manipulation with Carry (Optimal)
     *
     * Time Complexity: O(max(N, M))
     * - N and M are lengths of the two strings.
     *
     * Space Complexity: O(max(N, M))
     * - Result string.
     */
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}

