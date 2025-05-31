package Linkedin;

import org.testng.Assert;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 4, 5};
        Assert.assertEquals(removeDuplicates(arr), new int[]{1, 2, 3, 4, 5});
    }

    public static int[] removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        Arrays.sort(arr);
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {//Shifts unique elements forward instead of swapping
                j++;
                arr[j] = arr[i];
            }
        }
        return Arrays.copyOfRange(arr, 0, j + 1);
    }
}