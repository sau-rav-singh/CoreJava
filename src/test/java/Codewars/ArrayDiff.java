package Codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDiff {

    public static void main(String[] args) {
        int[] ans = arrayDiff(new int[]{1, 2, 2, 2, 3, 3, 4}, new int[]{2, 4});
        for (int a : ans) {
            System.out.println(a);
        }
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        if (b.length == 0) {
            return a;
        }

        Set<Integer> setB = new HashSet<>();
        for (int num : b) {
            setB.add(num);
        }

        return Arrays.stream(a)
                .filter(num -> !setB.contains(num))
                .toArray();
    }
}
