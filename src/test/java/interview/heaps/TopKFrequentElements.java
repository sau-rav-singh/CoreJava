package interview.heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    // QUESTION: Given an integer array nums and an integer k, return the k most frequent elements.
    // You may return the answer in any order.
    // Example: Input: nums = [1,1,1,2,2,3], k = 2
    //          Output: [1,2]
    // Time Complexity: O(n log k)
    // Space Complexity: O(n)

    public static int[] topKFrequent(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        // Count frequencies
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Min heap based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> frequencyMap.get(a) - frequencyMap.get(b)
        );

        for (int num : frequencyMap.keySet()) {
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

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequent(nums, k);
        System.out.print("Top K frequent elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: [1, 2]
    }
}
