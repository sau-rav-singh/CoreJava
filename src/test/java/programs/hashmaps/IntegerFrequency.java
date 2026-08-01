package programs.hashmaps;

import org.testng.Assert;

/**
 * Integer Frequency (Without HashMap)
 *
 * Problem Statement:
 * Given an array of integers, count the frequency of each element without using additional data structures like HashMap.
 *
 * Constraints:
 * - 1 <= arr.length <= 10^4
 * - -10^9 <= arr[i] <= 10^9
 */
public class IntegerFrequency {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4, 44};
        countOccurrences(arr);
    }

    /**
     * APPROACH: Brute Force with Visited Array
     *
     * Time Complexity: O(N²)
     * - Nested loops to count occurrences.
     *
     * Space Complexity: O(N)
     * - Visited array to track counted elements.
     */
    public static void countOccurrences(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println("Count of " + arr[i] + " is " + count);
            }
        }
    }
}
