package LeetCode;

import java.util.Arrays;

public class RemoveDuplicates_10 {

//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
//Consider the number of unique elements in nums to be k. After removing duplicates, return the number of unique elements k.
//The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));//[0,1,2,3,4,_,_,_,_,_] count=5
    }

    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[count]) {
                count++;
                nums[count] = nums[i];
            }
        }
        System.out.println("Array after Operations is "+ Arrays.toString(nums));
        return count + 1;
    }
}
