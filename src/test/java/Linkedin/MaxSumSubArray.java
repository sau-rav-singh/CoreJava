package Linkedin;

public class MaxSumSubArray {
    // QUESTION: Given an array of integers, find the maximum sum of any contiguous subarray.
    // Example: Input: [1, 12, -5, -6, 50, 3] -> Output: 55 (12 + (-5) + (-6) + 50 + 3)
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i : arr) {
            currentSum += i;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("Maximum Sum of Contiguous Subarray: " + maxSum);
    }
}