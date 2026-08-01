package programs.sorting;

import org.testng.Assert;

import java.util.Arrays;

/**
 * Sort Character Array
 *
 * Problem Statement:
 * Given a string, sort its characters in ascending order.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str consists of lowercase English letters.
 */
public class SortCharArray {

    public static void main(String[] args) {
        Assert.assertEquals(sortStringBubble("saurav"), "aarsuv");
        Assert.assertEquals(sortStringBuiltIn("saurav"), "aarsuv");
    }

    /**
     * APPROACH 1: Bubble Sort
     *
     * Time Complexity: O(N^2)
     * - Nested loops through the array.
     *
     * Space Complexity: O(N)
     * - Character array.
     */
    public static String sortStringBubble(String input) {
        char[] arr = input.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return new String(arr);
    }

    /**
     * APPROACH 2: Built-in Sort (Optimal)
     *
     * Time Complexity: O(N log N)
     * - Uses dual-pivot quicksort.
     *
     * Space Complexity: O(N)
     * - Character array.
     */
    public static String sortStringBuiltIn(String input) {
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}


