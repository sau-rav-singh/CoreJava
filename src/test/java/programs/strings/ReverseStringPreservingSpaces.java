package programs.strings;

import org.testng.Assert;

/**
 * Reverse String Preserving Spaces
 *
 * Problem Statement:
 * Given a string, reverse it while maintaining the original positions of spaces.
 *
 * Constraints:
 * - 1 <= str.length <= 10^4
 * - str consists of printable ASCII characters and spaces.
 */
public class ReverseStringPreservingSpaces {

    public static void main(String[] args) {
        Assert.assertEquals(reverseString("this is a phone"), "enoh pa s isiht");
    }

    /**
     * APPROACH: Two Pointers (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass with two pointers.
     *
     * Space Complexity: O(N)
     * - Character array for in-place modification.
     */
    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == ' ') {
                left++;
            } else if (arr[right] == ' ') {
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}

