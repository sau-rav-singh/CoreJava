package Linkedin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortHashMapByValue {

    public static void main(String[] args) {
        HashMap<String, Integer> unsortedMap = new HashMap<>();
        unsortedMap.put("apple", 10);
        unsortedMap.put("banana", 5);
        unsortedMap.put("cherry", 15);
        unsortedMap.put("date", 2);
        unsortedMap.put("elderberry", 10);

        System.out.println("Unsorted HashMap: " + unsortedMap);

        Map<String, Integer> sortedMapAscending = sortByValue(unsortedMap);
        System.out.println("Sorted HashMap by value (ascending): " + sortedMapAscending);

        Map<String, Integer> sortedMapDescending = sortByValueDescending(unsortedMap);
        System.out.println("Sorted HashMap by value (descending): " + sortedMapDescending);
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.comparingByValue());
        Map<K, V> sortedMap = new java.util.LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map) {
        List<Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Entry.<K, V>comparingByValue().reversed());
        Map<K, V> sortedMap = new java.util.LinkedHashMap<>();
        for (Entry<K, V> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}