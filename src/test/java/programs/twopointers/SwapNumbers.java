package programs.twopointers;

import org.testng.Assert;

/**
 * Swap Numbers
 *
 * Problem Statement:
 * Swap two numbers using a temporary variable and also without using a temporary variable.
 *
 * Constraints:
 * - -10^9 <= x, y <= 10^9
 */
public class SwapNumbers {

    public static void main(String[] args) {
        int x = 10, y = 5;
        int[] result1 = swapWithTemp(x, y);
        Assert.assertEquals(result1[0], 5);
        Assert.assertEquals(result1[1], 10);

        int[] result2 = swapWithoutTemp(x, y);
        Assert.assertEquals(result2[0], 5);
        Assert.assertEquals(result2[1], 10);
    }

    /**
     * APPROACH 1: Using Temporary Variable (Optimal)
     *
     * Time Complexity: O(1)
     * - Constant time operations.
     *
     * Space Complexity: O(1)
     * - Single temporary variable.
     */
    public static int[] swapWithTemp(int x, int y) {
        int t = x;
        x = y;
        y = t;
        return new int[]{x, y};
    }

    /**
     * APPROACH 2: Arithmetic Operations (No Temp Variable)
     *
     * Time Complexity: O(1)
     * - Constant time operations.
     *
     * Space Complexity: O(1)
     * - No extra space.
     *
     * Note: May cause overflow for large numbers.
     */
    public static int[] swapWithoutTemp(int x, int y) {
        x = x + y;
        y = x - y;
        x = x - y;
        return new int[]{x, y};
    }

    /**
     * APPROACH 3: XOR Operation (No Temp Variable, No Overflow)
     *
     * Time Complexity: O(1)
     * - Constant time operations.
     *
     * Space Complexity: O(1)
     * - No extra space.
     */
    public static int[] swapWithXOR(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        return new int[]{x, y};
    }
}

