package LeetCode;

public class MaxAverage_13 {

    //You are given an integer array nums consisting of n elements, and an integer k. Find a contiguous subarray whose length is equal to k that has the maximum average value and return this valu

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
    }

//    Time: O(n)
//    Space: O(1)

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        double maxSum = windowSum;
        for (int i = k; i < n; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum / k;
    }
}
