package advanced.dp;

public class LongestIncreasingSubsequence {
    // QUESTION: Given an integer array nums, return the length of the longest strictly increasing subsequence.
    // Example: Input: nums = [10,9,2,5,3,7,101,18]
    //          Output: 4 ([2,3,7,101])
    // Time Complexity: O(n log n) using binary search
    // Space Complexity: O(n)

    public static int lengthOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int[] tails = new int[nums.length];
        int size = 0;

        for (int num : nums) {
            int left = 0, right = size;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            tails[left] = num;
            if (left == size) {
                size++;
            }
        }

        return size;
    }

    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(lengthOfLIS(nums1)); // Output: 4

        int[] nums2 = {0, 1, 0, 3, 2, 3};
        System.out.println(lengthOfLIS(nums2)); // Output: 4
    }
}
