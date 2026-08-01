package programs.array;

import java.util.*;

/**
 * Problem Statement:
 * Given an array of integers, find all subarrays that sum to zero. Print each subarray.
 *
 * Constraints:
 * - Array elements can be positive, negative, or zero.
 */
public class ZeroSumSubarrays {

    /**
     * APPROACH: Prefix Sum with Hash Map
     *
     * Time Complexity: O(N^2) in the worst case (if there are many overlapping zero-sum subarrays),
     * or O(N + K) on average where K is the total number of zero-sum subarrays found.
     *
     * Space Complexity: O(N)
     * - The hash map stores prefix sum keys and lists of indices, taking linear space.
     */
    public static void printZeroSumSubarrays(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        Map<Integer, List<Integer>> map = new HashMap<>();
        // To handle cases where a subarray starts from index 0
        map.put(0, new ArrayList<>(List.of(-1)));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If the prefix sum has been seen before, it means the elements
            // between the previous index and current index 'i' sum to zero.
            if (map.containsKey(sum)) {
                List<Integer> indices = map.get(sum);
                for (int startIdx : indices) {
                    System.out.println("Subarray found: " +
                            Arrays.toString(Arrays.copyOfRange(arr, startIdx + 1, i + 1)));
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