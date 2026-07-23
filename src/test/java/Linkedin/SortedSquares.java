package Linkedin;

import java.util.Arrays;

public class SortedSquares {
    // QUESTION: Given a sorted array of integers (may contain negative numbers), return an array
    // of the squares of each number sorted in non-decreasing order.
    // Example: Input: [-7, -3, 2, 3, 11] -> Output: [4, 9, 9, 49, 121]
    //t:s:n
    public static void main(String[] args) {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] result = sortedSquares(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}

