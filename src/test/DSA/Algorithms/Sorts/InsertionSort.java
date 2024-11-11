package Algorithms.Sorts;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {2, 65, 23, 67, 34, 56};
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
