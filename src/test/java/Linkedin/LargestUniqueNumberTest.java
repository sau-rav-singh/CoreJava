package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class LargestUniqueNumberTest {

    @Test
    public void largestUniqueTest() {
        // All elements the same
        Assert.assertEquals(findLargestUniqueNumber(new int[]{2, 2, 2, 2}),-1);

        // Multiple unique numbers
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 2, 3, 4, 5}), Integer.valueOf(5));

        // Last number is the largest unique number
        Assert.assertEquals(findLargestUniqueNumber(new int[]{1, 1, 2, 2, 3, 4}), Integer.valueOf(4));

        // First number is the largest unique number
        Assert.assertEquals(findLargestUniqueNumber(new int[]{4, 3, 3, 2, 2, 1}), Integer.valueOf(4));

        // Mixed duplicates
        Assert.assertEquals(findLargestUniqueNumber(new int[]{3, 1, 4, 1, 5, 5}), Integer.valueOf(4));

        // Negative numbers
        //Assert.assertEquals(findLargestUniqueNumber(new int[]{-1, -2, -3, -4, -4, -3, -2, -1, 0}), Integer.valueOf(0));

        // Array with no elements
        Assert.assertEquals(findLargestUniqueNumber(new int[]{}),-1);

        // Array with one element
        Assert.assertEquals(findLargestUniqueNumber(new int[]{99}), Integer.valueOf(99));
    }
//t:nlogn,s:1
    public static Integer findLargestUniqueNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean isUnique = i == 0 || arr[i] != arr[i - 1];
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                isUnique = false;
            }
            if (isUnique) {
                return arr[i];
            }
        }
        return -1;
    }

    public int findLargestUniqueNumber1(int[] nums) {
        int[] counter = new int[1001];
        for (int x : nums) {
            counter[x]++;
        }
        for (int x = 1000; x >= 0; x--) {
            if (counter[x] == 1) {
                return x;
            }
        }
        return -1;
    }
}
