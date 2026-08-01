package programs.sorting;

import org.testng.Assert;

import java.util.Arrays;

/**
 * Bubble Sort
 *
 * Problem Statement:
 * Implement bubble sort algorithm to sort an array of integers in ascending order.
 * Bubble sort repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
 *
 * Constraints:
 * - 1 <= arr.length <= 10^4
 * - -10^4 <= arr[i] <= 10^4
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 4, 5, 6, 2, 1, 3};
        int[] sorted = bubbleSort(array.clone());
        Assert.assertEquals(sorted, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    /**
     * APPROACH 1: Bubble Sort with Optimization
     *
     * Time Complexity: O(N^2)
     * - Nested loops through the array.
     *
     * Space Complexity: O(1)
     * - In-place sorting.
     */
    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return array;
    }

    /**
     * APPROACH 2: Built-in Sort (Optimal)
     *
     * Time Complexity: O(N log N)
     * - Uses dual-pivot quicksort.
     *
     * Space Complexity: O(log N)
     * - Stack space for quicksort.
     */
    public static int[] builtInSort(int[] array) {
        Arrays.sort(array);
        return array;
    }
}

