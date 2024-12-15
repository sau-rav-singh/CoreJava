package Algorithms.Sorts;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {2, 65, 23, 67, 34, 56};
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}
