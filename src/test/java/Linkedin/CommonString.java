package Linkedin;

import java.util.*;

public class CommonString {
    //String[] a1 = {"apple", "banana", "single", "Laxmi", "Raghu"};
    //String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
    //𝐎𝐮𝐭𝐩𝐮𝐭:["apple", "Laxmi"]

    public static void main(String[] args) {
        String[] a1 = {"apple", "banana", "single", "Laxmi", "Raghu"};
        String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
        Set<String> a2Set = new HashSet<>(Arrays.asList(a2));
        List<String> result = new ArrayList<>();
        for (String ele : a1) {
            if (a2Set.contains(ele)) {
                result.add(ele);
            }
        }
        System.out.println(result);
        //Time Complexity: O(n + m)
        //Space Complexity: O(n + m)
    }
}
