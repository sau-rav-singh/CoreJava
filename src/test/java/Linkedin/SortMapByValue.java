package Linkedin;

import java.util.*;

public class SortMapByValue {

        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("apple", 10);
            map.put("banana", 5);
            map.put("orange", 15);
            map.put("grape", 8);

            List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

            list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            Map<String, Integer> sortedMap = new TreeMap<>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
            System.out.println("Sorted Map by Value (Descending):");
            for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
