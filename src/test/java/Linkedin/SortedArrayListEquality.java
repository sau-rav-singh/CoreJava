package Linkedin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortedArrayListEquality {
    public static void main(String[] args) {
        // Example 1: Equal ArrayLists
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(5, 2, 7, 1, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 7));

        // Step 1: Sort both ArrayLists
        Collections.sort(list1);
        Collections.sort(list2);

        // Step 2: Check for equality
        boolean isEqual1 = list1.equals(list2);
        System.out.println("Are sorted ArrayLists equal? " + isEqual1);

        // Example 2: Different ArrayLists
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(5, 2, 7, 1, 4));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        // Step 1: Sort both ArrayLists
        Collections.sort(list3);
        Collections.sort(list4);

        // Step 2: Check for equality
        boolean isEqual2 = list3.equals(list4);
        System.out.println("Are sorted ArrayLists equal? " + isEqual2);
    }
}
