package programs.searching;

import org.testng.Assert;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Kth Largest Element
 *
 * Problem Statement:
 * Given an array of integers and a number k, find the kth largest element in the array.
 *
 * Constraints:
 * - 1 <= arr.length <= 10^4
 * - -10^4 <= arr[i] <= 10^4
 * - 1 <= k <= arr.length
 */
public class KthLargestElement {

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4, 7};
        Assert.assertEquals(kthLargestHeap(arr, 3), 5);
        Assert.assertEquals(kthLargestSort(arr, 3), 5);
    }

    /**
     * APPROACH 1: Min Heap (Optimal for small k)
     *
     * Time Complexity: O(N log K)
     * - Heap operations for N elements.
     *
     * Space Complexity: O(K)
     * - Heap of size k.
     */
    public static int kthLargestHeap(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int val : arr) {
            minHeap.add(val);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    /**
     * APPROACH 2: Sorting (Optimal for large k)
     *
     * Time Complexity: O(N log N)
     * - Sorting the entire array.
     *
     * Space Complexity: O(1)
     * - In-place sort (if using arrays.sort).
     */
    public static int kthLargestSort(int[] arr, int k) {
        Arrays.sort(arr);
        return arr[arr.length - k];
    }

    /**
     * APPROACH 3: QuickSelect (Optimal average case)
     *
     * Time Complexity: O(N) average, O(N^2) worst case
     * - Partition-based selection.
     *
     * Space Complexity: O(1)
     * - In-place partitioning.
     */
    public static int kthLargestQuickSelect(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, arr.length - k);
    }

    private static int quickSelect(int[] arr, int left, int right, int k) {
        if (left == right) return arr[left];

        int pivotIndex = partition(arr, left, right);

        if (k == pivotIndex) {
            return arr[k];
        } else if (k < pivotIndex) {
            return quickSelect(arr, left, pivotIndex - 1, k);
        } else {
            return quickSelect(arr, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

