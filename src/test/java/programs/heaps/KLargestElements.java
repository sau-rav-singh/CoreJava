package programs.heaps;

import org.testng.Assert;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * K Largest Elements
 *
 * Problem Statement:
 * Given an integer array nums and an integer k, return the k largest elements in the array.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - 1 <= k <= nums.length
 */
public class KLargestElements {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int[] result = findKLargestHeap(nums, k);
        Arrays.sort(result);
        Assert.assertEquals(result, new int[]{5, 6});
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
    public static int[] findKLargestHeap(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
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
    public static int[] findKLargestSort(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        Arrays.sort(nums);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - 1 - i];
        }

        return result;
    }
}
