package programs.strings;

import org.testng.Assert;

/**
 * Print Triangle Pattern
 *
 * Problem Statement:
 * Print a right-angled triangle pattern of stars with the given number of rows.
 *
 * Constraints:
 * - 1 <= n <= 20
 */
public class PrintTrianglePattern {

    public static void main(String[] args) {
        int n = 5;
        printRightAngledTriangle(n);
        Assert.assertNotNull(printRightAngledTriangleToString(n));
    }

    /**
     * APPROACH: Nested Loops (Optimal)
     *
     * Time Complexity: O(N^2)
     * - Nested loops for pattern printing.
     *
     * Space Complexity: O(1)
     * - Constant extra space.
     */
    public static void printRightAngledTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /**
     * APPROACH 2: StringBuilder (For testing)
     *
     * Time Complexity: O(N^2)
     * - Nested loops for building string.
     *
     * Space Complexity: O(N^2)
     * - StringBuilder for output.
     */
    public static String printRightAngledTriangleToString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                sb.append(" ");
            }
            for (int j = 0; j <= i; j++) {
                sb.append("* ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

