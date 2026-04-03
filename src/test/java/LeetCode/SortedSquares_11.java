package LeetCode;

import java.util.Arrays;

public class SortedSquares_11 {

    //Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
    //Time Complexity:O(n)
    //Space Complexity:O(n)

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int p = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                result[p] = leftSquare;
                left++;
            } else {
                result[p] = rightSquare;
                right--;
            }
            p--;
        }

        return result;
    }
}
