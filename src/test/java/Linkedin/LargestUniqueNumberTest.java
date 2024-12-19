package Linkedin;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class LargestUniqueNumberTest {

    public static Integer findLargestUniqueNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if ((i == 0 || arr[i] != arr[i - 1]) && (i == arr.length - 1 || arr[i] != arr[i + 1])) {
                return arr[i];
            }
        }
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
        Assert.assertEquals(findLargestUniqueNumber(new int[]{-1, -2, -3, -4, -4, -3, -2, -1, 0}), Integer.valueOf(0));
        Assert.assertEquals(findLargestUniqueNumber(new int[]{}), -1);
        Assert.assertEquals(findLargestUniqueNumber(new int[]{99}), Integer.valueOf(99));
    }
}
