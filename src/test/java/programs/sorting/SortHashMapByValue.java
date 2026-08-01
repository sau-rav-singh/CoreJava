package programs.sorting;

import org.testng.Assert;

import java.util.*;

/**
 * Sort HashMap By Value
 *
 * Problem Statement:
 * Given a HashMap, sort it by its values in both ascending and descending order.
 *
 * Constraints:
 * - 1 <= map.size() <= 10^4
 * - Values are comparable integers.
 */
public class SortHashMapByValue {

    public static void main(String[] args) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 10);
        unsortedMap.put("banana", 5);
        unsortedMap.put("cherry", 15);
        unsortedMap.put("date", 2);
        unsortedMap.put("elderberry", 10);

        Map<String, Integer> sortedMapAscending = sortByValue(unsortedMap);
        Assert.assertEquals(sortedMapAscending.size(), 5);

        Map<String, Integer> sortedMapDescending = sortByValueDescending(unsortedMap);
        Assert.assertEquals(sortedMapDescending.size(), 5);
    }

    /**
     * APPROACH 1: Stream API (Optimal)
     *
     * Time Complexity: O(N log N)
     * - Sorting the entry list.
     *
     * Space Complexity: O(N)
     * - New LinkedHashMap.
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    /**
     * APPROACH 2: Stream API with Reverse
     *
     * Time Complexity: O(N log N)
     * - Sorting the entry list.
     *
     * Space Complexity: O(N)
     * - New LinkedHashMap.
     */
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<K, V>comparingByValue().reversed());
        Map<K, V> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
