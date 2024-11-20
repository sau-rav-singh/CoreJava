package Linkedin;

import java.util.HashMap;
import java.util.Map;

public class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 1, 2, 3, 4};
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print("Key is " + entry.getKey());
                System.out.println(" Value is " + entry.getValue());
            }
        }
    }
}
