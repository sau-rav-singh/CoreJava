package LeetCode;

import org.testng.Assert;

public class MissingNumber_6 {
    //Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

    public static void main(String[] args) {
        Assert.assertEquals(missingNumber(new int[]{3, 0, 1}),2);
        char a='a';
        if(Character.isAlphabetic(a)){
            System.out.println(true);
        }
    }

    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (len * (len + 1)) / 2;
        int arraySum = 0;
        for (int i : nums) {
            arraySum += i;
        }
        return sum - arraySum;
    }
}
