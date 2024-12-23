package Linkedin;

import java.util.Arrays;

public class MoveNegativeToStart {

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};//-12 -13 -5 -7 -3 -6 11 6 5
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveNegatives(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int insertIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                if (i != insertIndex) {
                    int temp = nums[i];
                    for (int j = i; j > insertIndex; j--) {
                        nums[j] = nums[j - 1];
                    }
                    nums[insertIndex] = temp;
                }
                insertIndex++;
            }
        }
    }
}
