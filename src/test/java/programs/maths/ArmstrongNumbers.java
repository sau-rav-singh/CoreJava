package programs.maths;

import org.testng.Assert;

/**
 * Armstrong Number
 *
 * Problem Statement:
 * An Armstrong number (also known as narcissistic number) is a number that is equal to
 * the sum of its own digits each raised to the power of the number of digits.
 * Write a function to check if a given number is an Armstrong number.
 *
 * Constraints:
 * - 0 <= num <= 10^9
 */
public class ArmstrongNumbers {

    public static void main(String[] args) {
        Assert.assertTrue(isArmstrong(153));
        Assert.assertTrue(isArmstrong(370));
        Assert.assertTrue(isArmstrong(371));
        Assert.assertTrue(isArmstrong(0));
        Assert.assertTrue(isArmstrong(1));
        Assert.assertFalse(isArmstrong(123));
        Assert.assertFalse(isArmstrong(100));
    }

    /**
     * APPROACH: Digit Extraction with Early Termination (Optimal)
     *
     * Time Complexity: O(D)
     * - D is the number of digits in the number.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static boolean isArmstrong(int num) {
        int originalNum = num;
        int digits = countDigits(num);
        int pow = 0;

        while (num != 0) {
            int rem = num % 10;
            pow += (int) Math.pow(rem, digits);
            if (pow > originalNum) {
                return false; // Early termination
            }
            num /= 10;
        }

        return pow == originalNum;
    }

    /**
     * APPROACH 2: String Conversion (Alternative)
     *
     * Time Complexity: O(D)
     * - D is the number of digits.
     *
     * Space Complexity: O(D)
     * - String representation of the number.
     */
    static boolean isArmstrongString(int num) {
        String numStr = String.valueOf(num);
        int digits = numStr.length();
        int sum = 0;

        for (char c : numStr.toCharArray()) {
            int digit = c - '0';
            sum += Math.pow(digit, digits);
            if (sum > num) {
                return false;
            }
        }

        return sum == num;
    }

    static int countDigits(int num) {
        int digits = 0;
        while (num != 0) {
            num /= 10;
            digits++;
        }
        return digits;
    }
}