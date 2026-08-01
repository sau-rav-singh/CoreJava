package programs.maths;

import org.testng.Assert;

/**
 * Prime Number
 *
 * Problem Statement:
 * Given an integer, determine if it is a prime number. A prime number is a number greater
 * than 1 that has no positive divisors other than 1 and itself.
 *
 * Constraints:
 * - -10^4 <= num <= 10^4
 */
public class PrimeNumber {

    public static void main(String[] args) {
        Assert.assertTrue(isPrime(23));
        Assert.assertFalse(isPrime(4));
        Assert.assertTrue(isPrime(2));
        Assert.assertFalse(isPrime(1));
    }

    /**
     * APPROACH: Square Root Optimization (Optimal)
     *
     * Time Complexity: O(sqrt(N))
     * - Check divisibility up to sqrt(n).
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * APPROACH 2: Brute Force
     *
     * Time Complexity: O(N)
     * - Check divisibility up to n-1.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    static boolean isPrimeBruteForce(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}

