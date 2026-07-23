package Linkedin;

import java.util.HashMap;

// QUESTION: Given an array of integers, count the frequency of each element and print the result.
// Example: Input: [1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3] -> Output: 1: 2, 2: 4, 3: 3, 4: 2
public class ArrayElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        for (int element : frequencyMap.keySet()) {
            System.out.println(element + ": " + frequencyMap.get(element));
        }
    }
}
