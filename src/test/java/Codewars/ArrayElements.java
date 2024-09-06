package Codewars;

import java.util.Arrays;

public class ArrayElements {

    //Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(take(arr, 2)));
        System.out.println(Arrays.toString(take(arr, 3)));
    }

    static int[] take(int[] arr, int n) {
        return n > arr.length ? arr : Arrays.copyOf(arr, n);
    }
}
