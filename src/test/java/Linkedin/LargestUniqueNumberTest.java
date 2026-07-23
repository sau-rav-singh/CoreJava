package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

// QUESTION: Given an array of integers, return the largest integer that occurs only once. If no
// such integer exists, return -1.
// Example: Input: [1, 2, 2, 3, 3, 4, 4, 4] -> Output: 1
//          Input: [2, 2, 2, 2] -> Output: -1
public class LargestUniqueNumberTest {

    public static Integer findLargestUniqueNumber(int[] nums) {
        final int kMax = 1000;
        int[] count = new int[kMax + 1];

        for (int num : nums)
            count[num]++;

        for (int num = kMax; num >= 0; num--)
            if (count[num] == 1)
                return num;

        return -1;
    }

    @Test
    public void largestUniqueTest() {
        Assert.assertEquals(findLargestUniqueNumber(new int[]{2, 2, 2, 2}), -1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 2, 2, 3, 3, 4, 4, 4}), 1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 2, 3, 4, 5}), Integer.valueOf(5));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 1, 2, 2, 3, 4}), Integer.valueOf(4));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{4, 3, 3, 2, 2, 1}), Integer.valueOf(4));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{3, 1, 4, 1, 5, 5}), Integer.valueOf(4));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{}), -1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{99}), Integer.valueOf(99));
    }
}
