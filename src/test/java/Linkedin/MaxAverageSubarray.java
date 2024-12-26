package Linkedin;

public class MaxAverageSubarray {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        System.out.println(getMaxAverage(arr, 4)); // Output: 12.75
        System.out.println(getMaxAverage(arr, 3)); // Output: 15.666...
    }

    private static double getMaxAverage(int[] arr, int k) {
        if (arr == null || arr.length < k) {
            throw new IllegalArgumentException("Invalid input");
        }
        double currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        double maxWindowSum = currentSum;
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum + arr[i] - arr[i - k];
            maxWindowSum = Math.max(maxWindowSum, currentSum);
        }
        return maxWindowSum / k;
    }
}
