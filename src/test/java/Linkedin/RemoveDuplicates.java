package Linkedin;

import org.testng.Assert;

import java.util.Arrays;

public class RemoveDuplicates {
    //t:nlogn
    //S:1
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        Assert.assertEquals(removeDuplicates(arr),new int[]{2,3,1,4,5});
        int[] arr1 = {1, 1, 2, 3, 4, 4, 5};
        Assert.assertEquals(removeDuplicatesInsOrderMaintain(arr1),new int[]{1,2,3,4,5});
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return Arrays.copyOfRange(arr, j, arr.length);
    }

    public static int[] removeDuplicatesInsOrderMaintain(int[] nums) {
        if (nums.length == 0) return nums;

        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return Arrays.copyOfRange(nums, 0, j + 1);
    }
}