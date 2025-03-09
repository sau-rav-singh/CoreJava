package Linkedin;

import java.util.Arrays;

public class Startingwith1 {
    //Given an array like arr = [1, 23, 123, 45, 67], print the numbers that start with 1
    public static void main(String[] args) {
        int[] arr = {1, 23, 123, 45, 134};
        Arrays.stream(arr).filter(num -> String.valueOf(num).startsWith("1")).forEach(System.out::println);
    }
}
