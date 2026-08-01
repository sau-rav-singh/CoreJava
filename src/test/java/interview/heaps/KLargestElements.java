package interview.heaps;

import java.util.PriorityQueue;

public class KLargestElements {
    // QUESTION: Given an integer array nums and an integer k, return the k largest elements in the array.
    // Example: Input: nums = [3,2,1,5,6,4], k = 2
    //          Output: [5,6] or [6,5]
    // Time Complexity: O(n log k)
    // Space Complexity: O(k)

    public static int[] findKLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        // Min heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove smallest
            }
        }

        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int[] result = findKLargest(nums, k);
        System.out.print("K largest elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [5, 6]
    }
}
