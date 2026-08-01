package programs.strings;

import org.testng.Assert;

import java.util.Arrays;

/**
 * LeetCode 344: Reverse String
 *
 * Problem Statement:
 * Write a function that reverses a string. The input string is given as an array of characters s.
 * You must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Constraints:
 * - 1 <= s.length <= 10^5
 * - s[i] is a printable ASCII character.
 */
public class ReverseCharArray {

    public static void main(String[] args) {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);
        Assert.assertEquals(arr, new char[]{'o', 'l', 'l', 'e', 'h'});
    }

    /**
     * APPROACH: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass with two pointers.
     *
     * Space Complexity: O(1)
     * - In-place swapping.
     */
    public static void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    /**
     * APPROACH 2: Built-in Arrays (Alternative)
     *
     * Time Complexity: O(N)
     * - Built-in reverse operation.
     *
     * Space Complexity: O(N)
     * - Creates a new array internally.
     */
    public static void reverseStringBuiltIn(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}

