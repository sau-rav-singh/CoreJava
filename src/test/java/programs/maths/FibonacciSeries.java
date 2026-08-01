package programs.maths;

import org.testng.Assert;

/**
 * Fibonacci Series
 *
 * Problem Statement:
 * Generate the first n numbers of the Fibonacci series.
 * The Fibonacci sequence is a series where each number is the sum of the two preceding ones.
 *
 * Constraints:
 * - 1 <= n <= 50
 */
public class FibonacciSeries {

    public static void main(String[] args) {
        int[] result = fibonacciDP(10);
        Assert.assertEquals(result[9], 34);
    }

    /**
     * APPROACH 1: Dynamic Programming (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the sequence.
     *
     * Space Complexity: O(N)
     * - Array to store the sequence.
     */
    public static int[] fibonacciDP(int n) {
        if (n <= 0) return new int[0];
        if (n == 1) return new int[]{0};

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib;
    }

    /**
     * APPROACH 2: Brute Force (Recursion)
     *
     * Time Complexity: O(2^N)
     * - Exponential due to repeated calculations.
     *
     * Space Complexity: O(N)
     * - Recursion stack depth.
     */
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    /**
     * APPROACH 3: Constant Space (Optimal Space)
     *
     * Time Complexity: O(N)
     * - Single pass through the sequence.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static int[] fibonacciConstantSpace(int n) {
        if (n <= 0) return new int[0];
        if (n == 1) return new int[]{0};

        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;

        int prev2 = 0, prev1 = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = prev1 + prev2;
            prev2 = prev1;
            prev1 = fib[i];
        }

        return fib;
    }
}

