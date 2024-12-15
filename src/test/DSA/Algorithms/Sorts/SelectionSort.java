package Algorithms.Sorts;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {2, 65, 23, 67, 34, 56};
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }

        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }
}

