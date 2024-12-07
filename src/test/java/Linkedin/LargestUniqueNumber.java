package Linkedin;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class LargestUniqueNumber {
    //t:nlogn,s:n
    public static void main(String[] args) {
        Integer[] arr = {9, 8, 8, 8};
        Integer largestUnique = findLargestUniqueNumber(arr);
        if (largestUnique != null) {
            System.out.println("The largest unique number is: " + largestUnique);
        } else {
            System.out.println("No unique number found.");
        }
    }

    public static Integer findLargestUniqueNumber(Integer[] arr) {
        Arrays.sort(arr, Collections.reverseOrder());
        int i = 0, j = 1;
        while (j < arr.length) {
            if (!Objects.equals(arr[i], arr[j])) {
                return arr[i];
            }
            i++;
            j++;
        }

        if (i == arr.length - 1) {
            return arr[i];
        }

        return null;
    }
}
