package Linkedin;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    //t:nlogn
    //S:1
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
        Integer[] arr1 = {1, 1, 2, 3, 4, 4, 5};
        Integer[] result1=removeDuplicatesInsOrderMaintain(arr1);
        System.out.println(Arrays.toString(result1));
    }

    public static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return Arrays.copyOfRange(arr, j, arr.length);
    }

    public static Integer[] removeDuplicatesInsOrderMaintain(Integer[] arr) {
        Set<Integer> lhs=new LinkedHashSet<>(Arrays.asList(arr));
        return lhs.toArray(new Integer[0]);
    }
}
