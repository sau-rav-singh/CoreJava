package gfg;

import java.util.Arrays;

public class MissingNumber {
    //You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
    public static int missingNum(int[] arr) {
        int n = arr.length + 1;
        long expectedSum = (long) n * (n + 1) / 2;
        long actualSum = Arrays.stream(arr).mapToLong(i -> i).sum();
        return (int) (expectedSum - actualSum);
    }

    public static void main(String[] args) {
        System.out.println("Missing Num is " + missingNum(new int[]{1, 2, 3, 5, 4}));

    }
}
