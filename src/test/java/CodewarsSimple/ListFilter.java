package CodewarsSimple;

import java.util.List;
import java.util.stream.Collectors;

public class ListFilter {
//Kata.filterList(List.of(1, 2, "a", "b", "aasf", "1", "123", 123)) => List.of(1, 2, 123)

    public static List<Integer> filterList(List<Object> list) {
        return list.stream()
                .filter(element -> element instanceof Integer)
                .map(element -> (Integer) element)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));  // Output: [1, 2]
        System.out.println(filterList(List.of(1, "a", "b", 0, 15)));  // Output: [1, 0, 15]
    }
}
