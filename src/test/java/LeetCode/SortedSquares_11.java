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
        int length = nums.length;
        int[] squares = new int[length];

        int left = 0;
        int right = length - 1;
        int p = length - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if (leftSquare > rightSquare) {
                squares[p] = leftSquare;
                left++;
            } else {
                squares[p] = rightSquare;
                right--;
            }
            p--;
        }

        return squares;
    }
}
