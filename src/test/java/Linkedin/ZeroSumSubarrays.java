package Linkedin;

import java.util.*;

public class ZeroSumSubarrays {
    public static void printZeroSumSubarrays(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>(List.of(-1)));// To handle cases where the subarray starts from index 0

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int startIdx : indices) {
                    System.out.println("Subarray found: " + Arrays.toString(Arrays.copyOfRange(arr, startIdx + 1, i + 1)));
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        System.out.println("Zero-sum subarrays:");
        printZeroSumSubarrays(arr);
    }
}
