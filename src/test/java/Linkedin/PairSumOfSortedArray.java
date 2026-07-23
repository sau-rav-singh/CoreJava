package Linkedin;

// QUESTION: Given a sorted array of integers and a target sum, find if there exists a pair of elements
// in the array that sum to the target. Return the pair if found.
// Example: Input: [1, 2, 3, 4, 5, 6], target = 8 -> Output: (2, 6) or (3, 5)
public class PairSumOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        targetSum(arr, 8);
        targetSum(arr, 5);
    }

    static void targetSum(int[] arr, int targetSum) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == targetSum) {
                System.out.println("Target Sum found: " + arr[i] + ", " + arr[j]);
                return;
            } else if (sum < targetSum) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("Target Sum not found.");
    }
}
