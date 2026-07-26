package InterviewPrep.Heaps;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    // QUESTION: You are given an array of integers nums, there is a sliding window of size k moving from the
    // very left of the array to the very right. You can only see the k numbers in the window. Return the
    // max sliding window.
    // Example: Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
    //          Output: [3,3,5,5,6,7]
    // Time Complexity: O(n log k)
    // Space Complexity: O(k)

    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];

        // Max heap: store [value, index]
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for (int i = 0; i < n; i++) {
            // Add current element to heap
            maxHeap.offer(new int[]{nums[i], i});

            // Remove elements outside the window
            while (maxHeap.peek()[1] <= i - k) {
                maxHeap.poll();
            }

            // Start recording results when window is full
            if (i >= k - 1) {
                result[i - k + 1] = maxHeap.peek()[0];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);
        System.out.print("Sliding window maximum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 3 3 5 5 6 7
    }
}
