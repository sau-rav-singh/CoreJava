package neetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {
    //Contains Duplicate: Given array [1,2,3,1], return true if any value appears twice.

    public static void main(String[] args) {
        System.out.println(containsDupe2(new int[]{1, 2, 3, 1}));
    }

    public static boolean containsDupe(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1])
                return true;
        }
        return false;
    }

    public static boolean containsDupe2(int[] array) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int i : array) {
            if (!uniqueElements.add(i))
                return true;
        }
        return false;
    }
}
