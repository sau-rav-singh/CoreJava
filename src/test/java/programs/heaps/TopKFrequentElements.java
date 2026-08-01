package programs.heaps;

import org.testng.Assert;

import java.util.*;

/**
 * LeetCode 347: Top K Frequent Elements
 *
 * Problem Statement:
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - k is in the range [1, the number of unique elements in the array].
 */
public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] result = topKFrequentHeap(nums, k);
        Arrays.sort(result);
        Assert.assertEquals(result, new int[]{1, 2});
    }

    /**
     * APPROACH 1: Min Heap (Optimal for small k)
     *
     * Time Complexity: O(N log K)
     * - Building frequency map O(N), heap operations O(N log K).
     *
     * Space Complexity: O(N)
     * - Frequency map and heap.
     */
    public static int[] topKFrequentHeap(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

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

    /**
     * APPROACH 2: Bucket Sort (Optimal for large k)
     *
     * Time Complexity: O(N)
     * - Single pass through array and buckets.
     *
     * Space Complexity: O(N)
     * - Frequency map and buckets.
     */
    public static int[] topKFrequentBucketSort(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        for (int num : frequencyMap.keySet()) {
            int freq = frequencyMap.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i >= 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    result[index++] = num;
                    if (index == k) break;
                }
            }
        }

        return result;
    }
}
