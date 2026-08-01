package programs.maths;

import org.testng.Assert;

/**
 * Factorial
 *
 * Problem Statement:
 * Calculate the factorial of a given number.
 * Factorial of n (n!) is the product of all positive integers from 1 to n.
 *
 * Constraints:
 * - 0 <= n <= 20 (to avoid integer overflow)
 */
public class Factorial {

    public static void main(String[] args) {
        Assert.assertEquals(factorialRecursive(5), 120);
        Assert.assertEquals(factorialIterative(5), 120);
    }

    /**
     * APPROACH 1: Recursion
     *
     * Time Complexity: O(N)
     * - N recursive calls.
     *
     * Space Complexity: O(N)
     * - Recursion stack depth.
     */
    public static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /**
     * APPROACH 2: Iterative (Optimal Space)
     *
     * Time Complexity: O(N)
     * - Single loop from 1 to n.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

