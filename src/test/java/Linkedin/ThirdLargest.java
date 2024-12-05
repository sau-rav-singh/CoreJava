package Linkedin;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdLargest {
    //Time Complexity: O(n log n)
    //Space Complexity: O(n)
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4, 7, 7};
        System.out.println("Third largest number is: " + findThirdLargest(arr));
    }

    public static int findThirdLargest(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .distinct().sorted(Comparator.reverseOrder())
                .skip(2).findFirst()
                .orElse(Arrays.stream(arr).max().orElseThrow());
    }
}
