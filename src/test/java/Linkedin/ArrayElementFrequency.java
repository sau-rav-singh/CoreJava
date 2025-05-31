package Linkedin;

import java.util.HashMap;

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
