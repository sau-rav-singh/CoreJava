package Linkedin;

import java.util.Arrays;
import java.util.Objects;

public class LargestUniqueNumber {
    //t:nlogn,s:n
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 3, 4, 5};
        Integer largestUnique = findLargestUniqueNumber(arr);
        if (largestUnique != null) {
            System.out.println("The largest unique number is: " + largestUnique);
        } else {
            System.out.println("No unique number found.");
        }
    }

    public static Integer findLargestUniqueNumber(Integer[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {
            if ((i == 0 || !Objects.equals(arr[i], arr[i - 1])) && (i == arr.length - 1 || !Objects.equals(arr[i], arr[i + 1]))) {
                return arr[i];
            }
        }
        return null;
    }
}
