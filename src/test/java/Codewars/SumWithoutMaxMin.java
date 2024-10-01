package Codewars;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class SumWithoutMaxMin {

    public static void main(String[] args) {
        assertEquals(16, sum(new int[] { 6, 2, 1, 8, 10}));

    }

    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length < 3) {
            return 0; // No valid sum can be calculated
        }
        int sum= Arrays.stream(numbers).sum();
        int max=Arrays.stream(numbers).max().orElse(0);
        int min=Arrays.stream(numbers).min().orElse(0);

        return sum-max-min;
    }
}
