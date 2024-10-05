package Codewars;

import java.util.Arrays;

import static org.testng.AssertJUnit.assertEquals;

public class EqualSumArray {
    public static void main(String[] args) {
        assertEquals(3, findEvenIndex(new int[]{1, 2, 3, 4, 3, 2, 1}));
        assertEquals(1, findEvenIndex(new int[]{1, 100, 50, -51, 1, 1}));
        assertEquals(0, findEvenIndex(new int[]{20, 10, -80, 10, 10, 15, 35}));
        assertEquals(-1, findEvenIndex(new int[]{1, 2, 3, 4}));
    }

    public static int findEvenIndex(int[] arr) {
        int totalSum = Arrays.stream(arr).sum();
        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }
}
