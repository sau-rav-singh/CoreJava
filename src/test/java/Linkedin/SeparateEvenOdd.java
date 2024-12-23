package Linkedin;

import java.util.Arrays;

public class SeparateEvenOdd {
    //Shift all even numbers to left side of array and odd number to right side.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveNegatives(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                for (int k = i; k > j; k--) {
                    nums[k] = nums[k - 1];
                }
                nums[j] = temp;
                j++;
            }
        }
    }
}
