package programs.heaps;

import org.testng.Assert;

import java.util.*;

/**
 * LeetCode 239: Sliding Window Maximum
 *
 * Problem Statement:
 * You are given an array of integers nums, there is a sliding window of size k moving from the
 * very left of the array to the very right. You can only see the k numbers in the window. Return the
 * max sliding window.
 *
 * Constraints:
 * - 1 <= nums.length <= 10^5
 * - -10^4 <= nums[i] <= 10^4
 * - 1 <= k <= nums.length
 */
public class SlidingWindowMaximum {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindowHeap(nums, k);
        Assert.assertEquals(result, new int[]{3, 3, 5, 5, 6, 7});
    }

    /**
     * APPROACH 1: Max Heap
     *
     * Time Complexity: O(N log K)
     * - Heap operations for N elements.
     *
     * Space Complexity: O(K)
     * - Heap of size k.
     */
    public static int[] maxSlidingWindowHeap(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            maxHeap.offer(new int[]{nums[i], i});

            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }

            if (i >= k - 1) {
                result[i - k + 1] = maxHeap.peek()[0];
            }
        }

        return result;
    }

    /**
     * APPROACH 2: Deque (Optimal)
     *
     * Time Complexity: O(N)
     * - Each element is added and removed at most once.
     *
     * Space Complexity: O(K)
     * - Deque of size k.
     */
    public static int[] maxSlidingWindowDeque(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove elements outside the window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Remove smaller elements from the back
            while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                deque.pollLast();
            }

            deque.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
