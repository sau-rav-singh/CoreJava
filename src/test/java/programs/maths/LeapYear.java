package programs.maths;

import org.testng.Assert;

/**
 * Leap Year
 *
 * Problem Statement:
 * Write a function to determine if a given year is a leap year.
 * A leap year is divisible by 4, except for century years which must be divisible by 400.
 *
 * Constraints:
 * - 1 <= year <= 10^4
 */
public class LeapYear {

    public static void main(String[] args) {
        Assert.assertFalse(isLeapYear(1900));
        Assert.assertTrue(isLeapYear(2000));
        Assert.assertTrue(isLeapYear(2020));
        Assert.assertFalse(isLeapYear(2021));
    }

    /**
     * APPROACH: Mathematical Check (Optimal)
     *
     * Time Complexity: O(1)
     * - Constant time operations.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }
}
