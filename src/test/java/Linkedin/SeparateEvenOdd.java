package Linkedin;

import java.util.Arrays;

public class SeparateEvenOdd {
    //Shift all even numbers to left side of array and odd number to right side.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        moveEven(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveEven(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i]= nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
