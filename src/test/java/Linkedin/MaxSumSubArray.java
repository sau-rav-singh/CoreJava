package Linkedin;

public class MaxSumSubArray {
    //find the max sum of contiguous subarrays in an array of integers
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