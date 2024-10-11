package Codewars;

import static org.testng.AssertJUnit.assertEquals;

public class RowSumOddNumbers {

    //             1
    //          3     5
    //       7     9    11
    //   13    15    17    19
    //21    23    25    27    29
    public static void main(String[] args) {
        assertEquals(8, RowSumOddNumbers.rowSumOddNumbers(2));

    }

    public static int rowSumOddNumbers(int n) {
        int start = n * (n - 1) + 1; // This is the first odd number in row n
        return findConsecutiveOddSum(start, n);
    }

    public static int findConsecutiveOddSum(int start, int count) {
        int sum = 0;
        int currentOdd = start;

        for (int i = 0; i < count; i++) {
            sum += currentOdd;
            currentOdd += 2;
        }

        return sum;
    }
}
