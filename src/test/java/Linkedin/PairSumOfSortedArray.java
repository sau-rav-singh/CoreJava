package Linkedin;

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
