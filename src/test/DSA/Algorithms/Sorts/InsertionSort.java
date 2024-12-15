package Algorithms.Sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 65, 23, 67, 34, 56};
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int curr = array[i];
            int prev = i - 1;
            while (prev >= 0 && array[prev] > curr) {
                array[prev + 1] = array[prev];
                prev--;
            }
            array[prev + 1] = curr;
        }

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
