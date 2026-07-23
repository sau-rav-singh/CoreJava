package Linkedin;

import java.util.Arrays;

public class MoveNegativesWithOrderMaintain {
    // QUESTION: Given an array of integers, move all negative numbers to the beginning of the array
    // while maintaining the relative order of both negative and positive numbers.
    // Example: Input: [-12, 11, -13, -5, 6, -7, 5, -3, -6]
    //          Output: [-12, -13, -5, -7, -3, -6, 11, 6, 5]

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};//-12 -13 -5 -7 -3 -6 11 6 5
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveNegatives(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (i != j) {
                    int temp = nums[i];
                    for (int k = i; k > j; k--) {
                        nums[k] = nums[k - 1];
                    }
                    nums[j] = temp;
                }
                j++;
            }
        }
    }
}
