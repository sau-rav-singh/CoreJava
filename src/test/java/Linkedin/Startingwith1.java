package Linkedin;

import java.util.Arrays;

public class Startingwith1 {
    // QUESTION: Given an array of integers, print all numbers that start with the digit 1.
    // Example: Input: [1, 23, 123, 45, 134] -> Output: 1, 23, 123, 134
    public static void main(String[] args) {
        int[] arr = {1, 23, 123, 45, 134};
        Arrays.stream(arr).filter(num -> String.valueOf(num).startsWith("1")).forEach(System.out::println);
    }
}
