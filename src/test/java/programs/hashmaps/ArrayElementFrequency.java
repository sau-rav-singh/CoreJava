package programs.hashmaps;

import org.testng.Assert;

import java.util.HashMap;

/**
 * Array Element Frequency
 *
 * Problem Statement:
 * Given an array of integers, count the frequency of each element and return the result.
 *
 * Constraints:
 * - 1 <= arr.length <= 10^5
 * - -10^9 <= arr[i] <= 10^9
 */
public class ArrayElementFrequency {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3};
        HashMap<Integer, Integer> frequencyMap = countFrequency(arr);
        Assert.assertEquals(frequencyMap.get(1).intValue(), 2);
        Assert.assertEquals(frequencyMap.get(2).intValue(), 4);
        Assert.assertEquals(frequencyMap.get(3).intValue(), 3);
        Assert.assertEquals(frequencyMap.get(4).intValue(), 2);
    }

    /**
     * APPROACH: HashMap (Optimal)
     *
     * Time Complexity: O(N)
     * - Single pass through the array.
     *
     * Space Complexity: O(N)
     * - HashMap storing unique elements.
     */
    public static HashMap<Integer, Integer> countFrequency(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int element : arr) {
            frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
        }
        return frequencyMap;
    }
}

